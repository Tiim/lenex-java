package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CONTACT")
@XmlAccessorType(XmlAccessType.NONE)
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
