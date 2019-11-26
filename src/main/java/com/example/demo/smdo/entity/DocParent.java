package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DocParent")
public class DocParent {

    private String idnumber;
    private String lastmsg_id;
    private String parmsg_id;
    private String delivery_type;
    private String parorg_id;

    //1
    private RegNumber RegNumber;


    @XmlAttribute(name = "idnumber")
    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }


    @XmlAttribute(name = "lastmsg_id")
    public String getLastmsg_id() {
        return lastmsg_id;
    }

    public void setLastmsg_id(String lastmsg_id) {
        this.lastmsg_id = lastmsg_id;
    }


    @XmlAttribute(name = "parmsg_id")
    public String getParmsg_id() {
        return parmsg_id;
    }

    public void setParmsg_id(String parmsg_id) {
        this.parmsg_id = parmsg_id;
    }


    @XmlAttribute(name = "delivery_type")
    public String getDelivery_type() {
        return delivery_type;
    }

    public void setDelivery_type(String delivery_type) {
        this.delivery_type = delivery_type;
    }


    @XmlAttribute(name = "parorg_id")
    public String getParorg_id() {
        return parorg_id;
    }

    public void setParorg_id(String parorg_id) {
        this.parorg_id = parorg_id;
    }


    @XmlElement(name = "RegNumber")
    public com.example.demo.smdo.entity.RegNumber getRegNumber() {
        return RegNumber;
    }

    public void setRegNumber(com.example.demo.smdo.entity.RegNumber regNumber) {
        RegNumber = regNumber;
    }
}
