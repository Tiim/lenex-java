package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "CONSTRUCTOR")
@XmlAccessorType(XmlAccessType.NONE)
public class Constructor {

    @XmlElement(name = "CONTACT", required = true)
    public Contact contact;
    @XmlAttribute(name = "name", required = true)
    public String name;
    @XmlAttribute(name = "registration")
    public String registration;
    @XmlAttribute(name = "version", required = true)
    public String version;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
