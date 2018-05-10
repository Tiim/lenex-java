package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.LocalDateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@XmlRootElement(name = "ATHLETE")
@XmlAccessorType(XmlAccessType.NONE)
public class Athlete {
    @XmlAttribute(name = "athleteid", required = true)
    public int athleteid;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlAttribute(name = "birthdate", required = true)
    public LocalDate birthdate;
    @XmlElement(name = "CLUB")
    public Club club;
    @XmlElementWrapper(name = "ENTRIES")
    @XmlElement(name = "ENTRY")
    public List<Entry> entries;
    @XmlAttribute(name = "firstname", required = true)
    public String firstname;
    @XmlAttribute(name = "firstname.en")
    public String firstnameEn;
    @XmlAttribute(name = "gender", required = true)
    public Gender gender;
    @XmlElement(name = "HANDICAP")
    public Handicap handicap;
    @XmlAttribute(name = "lastname", required = true)
    public String lastname;
    @XmlAttribute(name = "lastname.en")
    public String lastnameEn;
    @XmlAttribute(name = "level")
    public String level;
    @XmlAttribute(name = "license")
    public String license;
    @XmlAttribute(name = "nameprefix")
    public String nameprefix;
    @XmlAttribute(name = "nation")
    public Nation nation;
    @XmlAttribute(name = "passport")
    public String passport;
    @XmlElement(name = "RESULT")
    @XmlElementWrapper(name = "RESULTS")
    public List<Result> results;
    @XmlAttribute(name = "swrid")
    public int swrid;

    public int getAthleteid() {
        return athleteid;
    }

    public void setAthleteid(int athleteid) {
        this.athleteid = athleteid;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public List<Entry> getEntries() {
        if (entries == null) {
            return Collections.emptyList();
        }
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstnameEn() {
        return firstnameEn;
    }

    public void setFirstnameEn(String firstnameEn) {
        this.firstnameEn = firstnameEn;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Handicap getHandicap() {
        return handicap;
    }

    public void setHandicap(Handicap handicap) {
        this.handicap = handicap;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastnameEn() {
        return lastnameEn;
    }

    public void setLastnameEn(String lastnameEn) {
        this.lastnameEn = lastnameEn;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public List<Result> getResults() {
        if (results == null) {
            return Collections.emptyList();
        }
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public int getSwrid() {
        return swrid;
    }

    public void setSwrid(int swrid) {
        this.swrid = swrid;
    }
}
