package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.Objects;

@XmlType(propOrder = {"id","name","year","author","active","massSTR"}, name = "book")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "year",
        "author",
        "active",
        "massSTR"
})
public class Book {

    @JsonProperty("id")
    @XmlAttribute
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("year")
    private Long year;
    @JsonProperty("author")
    private String author;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("massSTR")
    private String[] massSTR;

    public Book(){
    }

    public Book(Long id, String name, Long year, String author, Boolean active,String[] massSTR) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.author = author;
        this.active = active;
        this.massSTR = massSTR;
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

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String[] getMassSTR() {
        return massSTR;
    }

    public void setMassSTR(String[] massSTR) {
        this.massSTR = massSTR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) &&
                name.equals(book.name) &&
                year.equals(book.year) &&
                author.equals(book.author) &&
                active.equals(book.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, year, author, active);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", active=" + active +
                '}';
    }
}
