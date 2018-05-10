package com.github.tiim.lenexjava.model;


import javax.xml.bind.annotation.*;

@XmlRootElement(name = "OFFICIAL")
@XmlAccessorType(XmlAccessType.NONE)
public class Official {
    @XmlElement(name = "CONTACT")
    private Contact contact;
    @XmlAttribute(name = "firstname", required = true)
    private String firstname;
    @XmlAttribute(name = "gender")
    private Gender gender;
    @XmlAttribute(name = "grade")
    private String grade;
    @XmlAttribute(name = "lastname", required = true)
    private String lastname;
    @XmlAttribute(name = "license")
    private String license;
    @XmlAttribute(name = "nameprefix")
    private String nameprefix;
    @XmlAttribute(name = "nation")
    private Nation nation;
    @XmlAttribute(name = "officialid", required = true)
    private int officialid;
    @XmlAttribute(name = "passport")
    private String passport;

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
