package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Header")
public class Header {

    private String msg_type;
    private String msg_acknow;

    //1
    private Sender Sender;

    //1-n n<=100
    private List<Receiver> Receiver;

    //0-1
    private Integrity Integrity;


    @XmlAttribute(name = "msg_type")
    public String getMsg_type() {
        return msg_type;
    }

    public void setMsg_type(String msg_type) {
        this.msg_type = msg_type;
    }


    @XmlAttribute(name = "msg_acknow")
    public String getMsg_acknow() {
        return msg_acknow;
    }

    public void setMsg_acknow(String msg_acknow) {
        this.msg_acknow = msg_acknow;
    }


    @XmlElement(name = "Sender")
    public com.example.demo.smdo.entity.Sender getSender() {
        return Sender;
    }

    public void setSender(com.example.demo.smdo.entity.Sender sender) {
        Sender = sender;
    }


    @XmlElement(name = "Receiver")
    public List<com.example.demo.smdo.entity.Receiver> getReceiver() {
        return Receiver;
    }

    public void setReceiver(List<com.example.demo.smdo.entity.Receiver> receiver) {
        Receiver = receiver;
    }


    @XmlElement(name = "Integrity")
    public com.example.demo.smdo.entity.Integrity getIntegrity() {
        return Integrity;
    }

    public void setIntegrity(com.example.demo.smdo.entity.Integrity integrity) {
        Integrity = integrity;
    }
}
