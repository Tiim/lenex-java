package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.LocalDateAdapter;
import com.google.common.base.MoreObjects;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@XmlRootElement(name = "ATHLETE")
@XmlAccessorType(XmlAccessType.NONE)
public class Athlete {
    @XmlAttribute(name = "athleteid", required = true)
    private int athleteid;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlAttribute(name = "birthdate", required = true)
    private LocalDate birthdate;
    @XmlElement(name = "CLUB")
    private Club club;
    @XmlElementWrapper(name = "ENTRIES")
    @XmlElement(name = "ENTRY")
    private List<Entry> entries;
    @XmlAttribute(name = "firstname", required = true)
    private String firstname;
    @XmlAttribute(name = "firstname.en")
    private String firstnameEn;
    @XmlAttribute(name = "gender", required = true)
    private Gender gender;
    @XmlElement(name = "HANDICAP")
    private Handicap handicap;
    @XmlAttribute(name = "lastname", required = true)
    private String lastname;
    @XmlAttribute(name = "lastname.en")
    private String lastnameEn;
    @XmlAttribute(name = "level")
    private String level;
    @XmlAttribute(name = "license")
    private String license;
    @XmlAttribute(name = "nameprefix")
    private String nameprefix;
    @XmlAttribute(name = "nation")
    private Nation nation;
    @XmlAttribute(name = "passport")
    private String passport;
    @XmlElement(name = "RESULT")
    @XmlElementWrapper(name = "RESULTS")
    private List<Result> results;
    @XmlAttribute(name = "swrid")
    private int swrid;

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

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", athleteid)
                .add("firstname", firstname)
                .add("firstnameEn", firstnameEn)
                .add("lastname", lastname)
                .add("lastnameEn", lastnameEn)
                .add("nameprefix", nameprefix)
                .add("birthdate", birthdate)
                .add("club", club)
                .add("entries", entries)
                .add("gender", gender)
                .add("handicap", handicap)
                .add("level", level)
                .add("license", license)
                .add("nation", nation)
                .add("passport", passport)
                .add("results", results)
                .add("swrid", swrid)
                .omitNullValues()
                .toString();
    }
}
