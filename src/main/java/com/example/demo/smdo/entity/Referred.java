package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Referred")
public class Referred {

    private String idnumber;
    private String retype;

    //0-1
    private RegNumber RegNumber;

    //0-1
    private TaskNumber TaskNumber;


    @XmlAttribute(name = "idnumber")
    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }


    @XmlAttribute(name = "retype")
    public String getRetype() {
        return retype;
    }

    public void setRetype(String retype) {
        this.retype = retype;
    }


    @XmlElement(name = "RegNumber")
    public com.example.demo.smdo.entity.RegNumber getRegNumber() {
        return RegNumber;
    }

    public void setRegNumber(com.example.demo.smdo.entity.RegNumber regNumber) {
        RegNumber = regNumber;
    }


    @XmlElement(name = "TaskNumber")
    public com.example.demo.smdo.entity.TaskNumber getTaskNumber() {
        return TaskNumber;
    }

    public void setTaskNumber(com.example.demo.smdo.entity.TaskNumber taskNumber) {
        TaskNumber = taskNumber;
    }
}
