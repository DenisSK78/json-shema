package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "surname",
        "age",
        "dateCreation",
        "readerlevel",
        "phonesArray",
        "bookList"
})
@XmlType(propOrder = {"id","name","surname","age","dateCreation","readerlevel","phonesArray","bookList"}, name = "user")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("surname")
    private String surname;
    @JsonProperty("age")
    private Long age;
    @JsonProperty("dateCreation")
    private Date dateCreation;
    @JsonProperty("readerlevel")
    private Readerlevel readerlevel;
    @JsonProperty("phonesArray")
    private String[] phonesArray;
    @JsonProperty("bookList")
    private List<Book> bookList;

    public User(){
    }

    public User(String surname, Long age, Date dateCreation, Readerlevel readerlevel, String[] phonesArray) {
        this.surname = surname;
        this.age = age;
        this.dateCreation = dateCreation;
        this.readerlevel = readerlevel;
        this.phonesArray = phonesArray;
    }

    public User(Long id, String name, String surname, Long age, Date dateCreation, Readerlevel readerlevel, String[] phonesArray) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dateCreation = dateCreation;
        this.readerlevel = readerlevel;
        this.phonesArray = phonesArray;
    }

    public User(Long id, String name, String surname, Long age, Date dateCreation, Readerlevel readerlevel, String[] phonesArray, List<Book> bookList) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dateCreation = dateCreation;
        this.readerlevel = readerlevel;
        this.phonesArray = phonesArray;
        this.bookList = bookList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Readerlevel getReaderlevel() {
        return readerlevel;
    }

    public void setReaderlevel(Readerlevel readerlevel) {
        this.readerlevel = readerlevel;
    }

    public String[] getPhonesArray() {
        return phonesArray;
    }

    public void setPhonesArray(String[] phonesArray) {
        this.phonesArray = phonesArray;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) &&
                name.equals(user.name) &&
                surname.equals(user.surname) &&
                age.equals(user.age) &&
                dateCreation.equals(user.dateCreation) &&
                readerlevel == user.readerlevel &&
                Objects.equals(bookList, user.bookList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, age, dateCreation, readerlevel, bookList);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", dateCreation=" + dateCreation +
                ", readerlevel=" + readerlevel +
                ", bookList=" + bookList +
                '}';
    }
}
