package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CONSTRUCTOR")
public class Constructor {

    @XmlElement(name = "CONTACT", required = true)
    public Contact contact;
    @XmlAttribute(name = "name", required = true)
    public String name;
    @XmlAttribute(name = "registration")
    public String registration;
    @XmlAttribute(name = "version", required = true)
    public String version;
}
