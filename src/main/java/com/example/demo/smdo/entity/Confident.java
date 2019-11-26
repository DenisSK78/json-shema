package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "Confident")
public class Confident {

    private String flag;
    private String numcopy;

    private String value;


    @XmlAttribute(name = "flag")
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }


    @XmlAttribute(name = "numcopy")
    public String getNumcopy() {
        return numcopy;
    }

    public void setNumcopy(String numcopy) {
        this.numcopy = numcopy;
    }


    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
