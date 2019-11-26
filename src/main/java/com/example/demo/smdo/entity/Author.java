package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Author")
public class Author {

    //???

    //0-1
    private OrganizationWithSign OrganizationWithSign;

    //0-1
    private PrivatePersonWithSign PrivatePersonWithSign;

    //0-1
    private OutNumber OutNumber;

    @XmlElement(name="OrganizationWithSign")
    public com.example.demo.smdo.entity.OrganizationWithSign getOrganizationWithSign() {
        return OrganizationWithSign;
    }

    public void setOrganizationWithSign(com.example.demo.smdo.entity.OrganizationWithSign organizationWithSign) {
        OrganizationWithSign = organizationWithSign;
    }


    @XmlElement(name="PrivatePersonWithSign")
    public com.example.demo.smdo.entity.PrivatePersonWithSign getPrivatePersonWithSign() {
        return PrivatePersonWithSign;
    }

    public void setPrivatePersonWithSign(com.example.demo.smdo.entity.PrivatePersonWithSign privatePersonWithSign) {
        PrivatePersonWithSign = privatePersonWithSign;
    }

    @XmlElement(name="OutNumber")
    public com.example.demo.smdo.entity.OutNumber getOutNumber() {
        return OutNumber;
    }

    public void setOutNumber(com.example.demo.smdo.entity.OutNumber outNumber) {
        OutNumber = outNumber;
    }
}
