package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Envelop")
public class Envelop {

    private String dtstamp;
    private String type;
    private String msg_id;
    private String subject;

    private Header Header;
    private Body Body;


    @XmlAttribute(name = "dtstamp")
    public String getDtstamp() {
        return dtstamp;
    }

    public void setDtstamp(String dtstamp) {
        this.dtstamp = dtstamp;
    }


    @XmlAttribute(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @XmlAttribute(name = "msg_id")
    public String getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(String msg_id) {
        this.msg_id = msg_id;
    }


    @XmlAttribute(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    @XmlElement(name = "Header")
    public com.example.demo.smdo.entity.Header getHeader() {
        return Header;
    }

    public void setHeader(com.example.demo.smdo.entity.Header header) {
        Header = header;
    }


    @XmlElement(name = "Body")
    public com.example.demo.smdo.entity.Body getBody() {
        return Body;
    }

    public void setBody(com.example.demo.smdo.entity.Body body) {
        Body = body;
    }
}
