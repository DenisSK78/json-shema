package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import java.util.List;

@XmlRootElement(name = "DocTransfer")
public class DocTransfer {

    private String name;
    private String os;
    private String type;
    private String ordernum;
    private String type_ver;
    private String char_set;
    private String description;
    private String created;
    private String modified;

    //private String value;

    //1
    private Data Data;

    //Document 1-20
    //TaskList 0-1
    //AddDocuments 0-1 1-n ???
    //Acknowledgement нет
    private List<Signature> Signature;


    @XmlAttribute(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @XmlAttribute(name = "os")
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }


    @XmlAttribute(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @XmlAttribute(name = "ordernum")
    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }


    @XmlAttribute(name = "type_ver")
    public String getType_ver() {
        return type_ver;
    }

    public void setType_ver(String type_ver) {
        this.type_ver = type_ver;
    }


    @XmlAttribute(name = "char_set")
    public String getChar_set() {
        return char_set;
    }

    public void setChar_set(String char_set) {
        this.char_set = char_set;
    }


    @XmlAttribute(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @XmlAttribute(name = "created")
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }


    @XmlAttribute(name = "modified")
    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }


//    @XmlValue
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }


    @XmlElement(name = "Data")
    public com.example.demo.smdo.entity.Data getData() {
        return Data;
    }

    public void setData(com.example.demo.smdo.entity.Data data) {
        Data = data;
    }


    @XmlElement(name = "Signature")
    public List<com.example.demo.smdo.entity.Signature> getSignature() {
        return Signature;
    }

    public void setSignature(List<com.example.demo.smdo.entity.Signature> signature) {
        Signature = signature;
    }

}
