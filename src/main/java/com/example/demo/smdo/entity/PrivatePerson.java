package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "PrivatePerson")
public class PrivatePerson {

    private String inn;
    private String doc_kind;
    private String doc_num;
    private String doc_org;
    private String doc_date;

    //1
    private Name Name;

    //0-n
    private List<Rank> Rank;

    //0-1
    private Address Address;

    //0-n
    private List<Econtact> Econtact;


    @XmlAttribute(name = "inn")
    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }


    @XmlAttribute(name = "doc_kind")
    public String getDoc_kind() {
        return doc_kind;
    }

    public void setDoc_kind(String doc_kind) {
        this.doc_kind = doc_kind;
    }


    @XmlAttribute(name = "doc_num")
    public String getDoc_num() {
        return doc_num;
    }

    public void setDoc_num(String doc_num) {
        this.doc_num = doc_num;
    }


    @XmlAttribute(name = "doc_org")
    public String getDoc_org() {
        return doc_org;
    }

    public void setDoc_org(String doc_org) {
        this.doc_org = doc_org;
    }


    @XmlAttribute(name = "doc_date")
    public String getDoc_date() {
        return doc_date;
    }

    public void setDoc_date(String doc_date) {
        this.doc_date = doc_date;
    }


    @XmlElement(name = "Name")
    public com.example.demo.smdo.entity.Name getName() {
        return Name;
    }

    public void setName(com.example.demo.smdo.entity.Name name) {
        Name = name;
    }


    @XmlElement(name = "Rank")
    public List<com.example.demo.smdo.entity.Rank> getRank() {
        return Rank;
    }

    public void setRank(List<com.example.demo.smdo.entity.Rank> rank) {
        Rank = rank;
    }


    @XmlElement(name = "Address")
    public com.example.demo.smdo.entity.Address getAddress() {
        return Address;
    }

    public void setAddress(com.example.demo.smdo.entity.Address address) {
        Address = address;
    }


    @XmlElement(name = "Econtact")
    public List<com.example.demo.smdo.entity.Econtact> getEcontact() {
        return Econtact;
    }

    public void setEcontact(List<com.example.demo.smdo.entity.Econtact> econtact) {
        Econtact = econtact;
    }
}
