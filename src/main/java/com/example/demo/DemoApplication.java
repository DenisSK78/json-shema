package com.example.demo;

import com.example.demo.entity.Book;
import com.example.demo.entity.Readerlevel;
import com.example.demo.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {

		ObjectMapper mapper = new ObjectMapper();

		// Инициализируем и создаем Json
		User user = new User(1L,"Алексей","Петрик", 25L, new Date(), Readerlevel.HIGH, new String[] {"+375256768778", "+375337778899", "+375442345678"});
		Book book1 = new Book(1L,"Книга 1", 1995L,"Автор 1", true, new String[] {"aaa", "bbb", "ccc"});
		Book book2 = new Book(2L,"Книга 2", 1996L,"Автор 2", true, new String[] {"qqq", "www", "eee"});
		Book book3 = new Book(3L,"Книга 3", 1997L,"Автор 3", true, new String[] {"yyy", "ttt", "rrr"});
		List<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		user.setBookList(books);
		File path = new File("D:/");
		File file = new File(path, "user.json");
		try {
			FileWriter jsonFile = new FileWriter(file);
			mapper.writeValue(jsonFile,user);
			jsonFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("json created!");

		User userNotValid = new User(-1L,"Алексей","Петрик", 25L, new Date(), Readerlevel.HIGH, new String[] {"+375246768778", "+375337778899", "+375442345678"});
		Book bookNotValid = new Book(0L,"Книга 1", 1995L,"", null, new String[] {"aaa", "bbb", "ccc"});
		List<Book> booksNotValid = new ArrayList<>();
		booksNotValid.add(bookNotValid);
		userNotValid.setBookList(booksNotValid);

		// Создаем и сохраняем Json-schema
//		File path = new File("D:/");
//		SchemaFactoryWrapper visitor = new SchemaFactoryWrapper();
//		mapper.acceptJsonFormatVisitor(User.class, visitor);
//		JsonSchema jsonSchema = visitor.finalSchema();
//		//System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonSchema));
//		File fileSchema = new File(path, "userSchema.json");
//		try {
//			FileWriter jsonFile = new FileWriter(fileSchema);
//			mapper.writeValue(jsonFile,jsonSchema);
//			jsonFile.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		FileInputStream fileInputStream = new FileInputStream("D:\\userSchema.json");
		JSONObject jsonSchema = new JSONObject(new JSONTokener(fileInputStream));
		//JSONObject jsonSchema1 = new JSONObject(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonSchema));
		JSONObject jsonObjectValid = new JSONObject(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user));
		JSONObject jsonObjectNotValid = new JSONObject(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(userNotValid));
		jsonValidSchema(jsonSchema,jsonObjectValid);
		jsonValidSchema(jsonSchema,jsonObjectNotValid);
	}

	public static void jsonValidSchema(JSONObject jsonSchema, JSONObject jsonObject) {
		SchemaLoader loader = SchemaLoader.builder()
				.schemaJson(jsonSchema)
				.draftV7Support() // or draftV6Support()
				.build();
		Schema schemaValidate = loader.load().build();
		try {
			schemaValidate.validate(jsonObject);
			System.out.println("Valid!");
		} catch (ValidationException e) {
			System.out.println("Not Valid!");
			System.out.println(e.getMessage());
			e.getCausingExceptions().stream()
					.map(ValidationException::getMessage)
					.forEach(System.out::println);
		}
	}



















	public static Boolean jsonValid() throws JsonProcessingException {
//		ObjectMapper mapper = new ObjectMapper();
//		SchemaMapper schemaMapper = new SchemaMapper();
//		JSONObject jsonObject = schemaMapper.toJsonSchema4(NomenclatureAffair.class, true);
//
//		File path = new File("D:/");
//		File fileW = new File(path, "schemaNomenclatureAffair.json");
//		try {
//			FileWriter jsonFile = new FileWriter(fileW);
//			jsonFile.write(jsonObject.toString(4));
//			jsonFile.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		NomenclatureAffair  nomenclatureAffair = new NomenclatureAffair(1L,"Name","223344",2019,true,false);
//
//		JSONObject jsonSchema = new JSONObject(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schemaNomenclatureAffair));
//		JSONObject jsonObject = new JSONObject(nomenclatureAffair);
//		Schema schemaValidate = SchemaLoader.load(jsonSchema);
//		schemaValidate.validate(jsonObject);
//		System.out.println("NomenclatureAffair = " + Boolean.TRUE);
		return true;
	}
}
