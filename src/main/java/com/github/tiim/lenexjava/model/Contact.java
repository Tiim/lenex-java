package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CONTACT")
public class Contact {

    @XmlAttribute(name = "city")
    public String city;
    @XmlAttribute(name = "country")
    public String country;
    @XmlAttribute(name = "email", required = true)
    public String email;
    @XmlAttribute(name = "fax")
    public String fax;
    @XmlAttribute(name = "internet")
    public String internet;
    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "mobile")
    public String mobile;
    @XmlAttribute(name = "phone")
    public String phone;
    @XmlAttribute(name = "state")
    public String state;
    @XmlAttribute(name = "street")
    public String street;
    @XmlAttribute(name = "street2")
    public String street2;
    @XmlAttribute(name = "zip")
    public String zip;
}
