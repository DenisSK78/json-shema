package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "Signature")
public class Signature {

    private String keyid;
    private String signer;
    private String signtime;
    private String operation_type;
    private String orig_signature;

    private String value; //???


    @XmlAttribute(name = "keyid")
    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid;
    }


    @XmlAttribute(name = "signer")
    public String getSigner() {
        return signer;
    }

    public void setSigner(String signer) {
        this.signer = signer;
    }


    @XmlAttribute(name = "signtime")
    public String getSigntime() {
        return signtime;
    }

    public void setSigntime(String signtime) {
        this.signtime = signtime;
    }


    @XmlAttribute(name = "operation_type")
    public String getOperation_type() {
        return operation_type;
    }

    public void setOperation_type(String operation_type) {
        this.operation_type = operation_type;
    }


    @XmlAttribute(name = "orig_signature")
    public String getOrig_signature() {
        return orig_signature;
    }

    public void setOrig_signature(String orig_signature) {
        this.orig_signature = orig_signature;
    }


    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
