package com.github.tiim.lenexjava.model;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OFFICIAL")
public class Official {
    @XmlElement(name = "CONTACT")
    public Contact contact;
    @XmlAttribute(name = "firstname", required = true)
    public String firstname;
    @XmlAttribute(name = "gender")
    public Gender gender;
    @XmlAttribute(name = "grade")
    public String grade;
    @XmlAttribute(name = "lastname", required = true)
    public String lastname;
    @XmlAttribute(name = "license")
    public String license;
    @XmlAttribute(name = "nameprefix")
    public String nameprefix;
    @XmlAttribute(name = "nation")
    public Nation nation;
    @XmlAttribute(name = "officialid", required = true)
    public int officialid;
    @XmlAttribute(name = "passport")
    public String passport;
}
