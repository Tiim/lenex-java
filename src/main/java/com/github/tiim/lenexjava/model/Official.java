package com.github.tiim.lenexjava.model;


import javax.xml.bind.annotation.*;

@XmlRootElement(name = "OFFICIAL")
@XmlAccessorType(XmlAccessType.NONE)
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

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getNameprefix() {
        return nameprefix;
    }

    public void setNameprefix(String nameprefix) {
        this.nameprefix = nameprefix;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public int getOfficialid() {
        return officialid;
    }

    public void setOfficialid(int officialid) {
        this.officialid = officialid;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
