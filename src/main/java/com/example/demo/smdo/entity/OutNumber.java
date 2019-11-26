package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OutNumber")
public class OutNumber {

    //1
    private RegNumber RegNumber;


    @XmlElement(name = "RegNumber")
    public com.example.demo.smdo.entity.RegNumber getRegNumber() {
        return RegNumber;
    }

    public void setRegNumber(com.example.demo.smdo.entity.RegNumber regNumber) {
        RegNumber = regNumber;
    }
}
