package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Expansion")
public class Expansion {

    //1
    private Controlset Controlset;

    //1
    private Varset Varset;


    @XmlElement(name = "Controlset")
    public com.example.demo.smdo.entity.Controlset getControlset() {
        return Controlset;
    }

    public void setControlset(com.example.demo.smdo.entity.Controlset controlset) {
        Controlset = controlset;
    }


    @XmlElement(name = "Varset")
    public com.example.demo.smdo.entity.Varset getVarset() {
        return Varset;
    }

    public void setVarset(com.example.demo.smdo.entity.Varset varset) {
        Varset = varset;
    }
}
