package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Controlset")
public class Controlset {

    //????

    //1
    private String Supplement;
    //1
    private String Version;
    //1
    private String Date;

    @XmlElement(name = "Supplement")
    public String getSupplement() {
        return Supplement;
    }

    public void setSupplement(String supplement) {
        Supplement = supplement;
    }


    @XmlElement(name = "Version")
    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }


    @XmlElement(name = "Date")
    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
