package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Acknowledgement")
public class Acknowledgement {

    private String msg_id;
    private String ack_type;

    //1
    private RegNumber RegNumber;

    //0-1
    private IncNumber IncNumber;

    //1-n
    private List<AckResult> AckResult;

    //0-1
    private DocTransfer DocTransfer;


    @XmlAttribute(name="msg_id")
    public String getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(String msg_id) {
        this.msg_id = msg_id;
    }


    @XmlAttribute(name="ack_type")
    public String getAck_type() {
        return ack_type;
    }

    public void setAck_type(String ack_type) {
        this.ack_type = ack_type;
    }


    @XmlElement(name="RegNumber")
    public com.example.demo.smdo.entity.RegNumber getRegNumber() {
        return RegNumber;
    }

    public void setRegNumber(com.example.demo.smdo.entity.RegNumber regNumber) {
        RegNumber = regNumber;
    }


    @XmlElement(name="IncNumber")
    public com.example.demo.smdo.entity.IncNumber getIncNumber() {
        return IncNumber;
    }

    public void setIncNumber(com.example.demo.smdo.entity.IncNumber incNumber) {
        IncNumber = incNumber;
    }


    @XmlElement(name="AckResult")
    public List<com.example.demo.smdo.entity.AckResult> getAckResult() {
        return AckResult;
    }

    public void setAckResult(List<com.example.demo.smdo.entity.AckResult> ackResult) {
        AckResult = ackResult;
    }


    @XmlElement(name="DocTransfer")
    public com.example.demo.smdo.entity.DocTransfer getDocTransfer() {
        return DocTransfer;
    }

    public void setDocTransfer(com.example.demo.smdo.entity.DocTransfer docTransfer) {
        DocTransfer = docTransfer;
    }
}
