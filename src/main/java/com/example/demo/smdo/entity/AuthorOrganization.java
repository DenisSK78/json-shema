package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AuthorOrganization")
public class AuthorOrganization {

    //???

    //1
    private OrganizationWithSign OrganizationWithSign;

    @XmlElement(name="OrganizationWithSign")
    public com.example.demo.smdo.entity.OrganizationWithSign getOrganizationWithSign() {
        return OrganizationWithSign;
    }

    public void setOrganizationWithSign(com.example.demo.smdo.entity.OrganizationWithSign organizationWithSign) {
        OrganizationWithSign = organizationWithSign;
    }
}
