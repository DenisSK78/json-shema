package com.example.demo.services.impl;

import com.example.demo.entity.Book;
import com.example.demo.services.ServiceBook;
import org.springframework.stereotype.Service;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

@Service
public class ServiceBookImpl implements ServiceBook {

    @Override
    public void createXmlFile(Book book) {
//        try {
//            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
//
//            //book elements
//            Document doc = docBuilder.newDocument();
//
//            Element bookElement = doc.createElement("book");
//            doc.appendChild(bookElement);
//
//            Element idElement = doc.createElement("id");
//            idElement.appendChild(doc.createTextNode(book.getId().toString()));
//            bookElement.appendChild(idElement);
//
//            Element nameElement = doc.createElement("name");
//            nameElement.appendChild(doc.createTextNode(book.getName()));
//            bookElement.appendChild(nameElement);
//
//            Element yearElement = doc.createElement("year");
//            yearElement.appendChild(doc.createTextNode(book.getYear().toString()));
//            bookElement.appendChild(yearElement);
//
//            Element authorElement = doc.createElement("author");
//            authorElement.appendChild(doc.createTextNode(book.getAuthor()));
//            bookElement.appendChild(authorElement);
//
//            //write the content into xml file
//            TransformerFactory transformerFactory = TransformerFactory.newInstance();
//            Transformer transformer = transformerFactory.newTransformer();
//            DOMSource source = new DOMSource(doc);
//            StreamResult result = new StreamResult(new File("C:\\book.xml"));
//
//            //Output to console for testing
//            //StreamResult result = new StreamResult(System.out);
//
//            transformer.transform(source, result);
//
//            System.out.println("File saved!");
//
//        } catch (ParserConfigurationException pce) {
//            pce.printStackTrace();
//        } catch (TransformerException tfe) {
//            tfe.printStackTrace();
//        }
        try {
            JAXBContext context = JAXBContext.newInstance(Book.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(book, new File("C:\\book1.xml"));
            System.out.println("book1.xml Save");

            context.generateSchema(new SchemaOutputResolver() {

                @Override
                public Result createOutput(String namespaceURI, String suggestedFileName)
                        throws IOException {
                    return new StreamResult(suggestedFileName);
                }

            });
        } catch (JAXBException | IOException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public Boolean checkXsdSchema(String pathXml, String pathXsd) {
        try {
            File xml = new File(pathXml);
            File xsd = new File(pathXsd);

            if (!xml.exists()) {
                System.out.println("Не найден XML " + pathXml);
            }

            if (!xsd.exists()) {
                System.out.println("Не найден XSD " + pathXsd);
            }

            if (!xml.exists() || !xsd.exists()) {
                return false;
            }

//            SchemaFactory factory = SchemaFactory
//                    .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
//            Schema schema = factory.newSchema(new StreamSource(pathXsd));
//            Validator validator = schema.newValidator();
//            validator.validate(new StreamSource(pathXml));
            SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
                    .newSchema(xsd)
                    .newValidator()
                    .validate(new StreamSource(xml));
            return true;
        } catch (SAXException | IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
