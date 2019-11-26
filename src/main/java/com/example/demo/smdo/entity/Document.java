package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Document")
public class Document {

    private String idnumber;
    private String type;
    private String kind;
    private String pages;
    private String title;
    private String annotation;
    private String collection;

    //1
    private RegNumber RegNumber;

    //0-1
    private DocParent DocParent;

    //1
    private Confident Confident;

    //0-n
    private List<Referred> Referred;

    //0-n
    private List<DocNumber> DocNumber;

    //1-n
    private List<DocTransfer> DocTransfer;

    //0-n
    private List<RegHistory> RegHistory;

    //1-n
    private List<Author> Author;

    //0-n
    private List<Validator> Validator;

    //0-1
    private Writer Writer;


    @XmlAttribute(name = "idnumber")
    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }


    @XmlAttribute(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @XmlAttribute(name = "kind")
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }


    @XmlAttribute(name = "pages")
    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }


    @XmlAttribute(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @XmlAttribute(name = "annotation")
    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }


    @XmlAttribute(name = "collection")
    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }


    @XmlElement(name = "RegNumber")
    public com.example.demo.smdo.entity.RegNumber getRegNumber() {
        return RegNumber;
    }

    public void setRegNumber(com.example.demo.smdo.entity.RegNumber regNumber) {
        RegNumber = regNumber;
    }


    @XmlElement(name = "DocParent")
    public com.example.demo.smdo.entity.DocParent getDocParent() {
        return DocParent;
    }

    public void setDocParent(com.example.demo.smdo.entity.DocParent docParent) {
        DocParent = docParent;
    }


    @XmlElement(name = "Confident")
    public com.example.demo.smdo.entity.Confident getConfident() {
        return Confident;
    }

    public void setConfident(com.example.demo.smdo.entity.Confident confident) {
        Confident = confident;
    }


    @XmlElement(name = "Referred")
    public List<com.example.demo.smdo.entity.Referred> getReferred() {
        return Referred;
    }

    public void setReferred(List<com.example.demo.smdo.entity.Referred> referred) {
        Referred = referred;
    }


    @XmlElement(name = "DocNumber")
    public List<com.example.demo.smdo.entity.DocNumber> getDocNumber() {
        return DocNumber;
    }

    public void setDocNumber(List<com.example.demo.smdo.entity.DocNumber> docNumber) {
        DocNumber = docNumber;
    }


    @XmlElement(name = "DocTransfer")
    public List<com.example.demo.smdo.entity.DocTransfer> getDocTransfer() {
        return DocTransfer;
    }

    public void setDocTransfer(List<com.example.demo.smdo.entity.DocTransfer> docTransfer) {
        DocTransfer = docTransfer;
    }


    @XmlElement(name = "RegHistory")
    public List<com.example.demo.smdo.entity.RegHistory> getRegHistory() {
        return RegHistory;
    }

    public void setRegHistory(List<com.example.demo.smdo.entity.RegHistory> regHistory) {
        RegHistory = regHistory;
    }


    @XmlElement(name = "Author")
    public List<com.example.demo.smdo.entity.Author> getAuthor() {
        return Author;
    }

    public void setAuthor(List<com.example.demo.smdo.entity.Author> author) {
        Author = author;
    }


    @XmlElement(name = "Validator")
    public List<com.example.demo.smdo.entity.Validator> getValidator() {
        return Validator;
    }

    public void setValidator(List<com.example.demo.smdo.entity.Validator> validator) {
        Validator = validator;
    }


    @XmlElement(name = "Writer")
    public com.example.demo.smdo.entity.Writer getWriter() {
        return Writer;
    }

    public void setWriter(com.example.demo.smdo.entity.Writer writer) {
        Writer = writer;
    }
}
