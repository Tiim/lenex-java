package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "CLUB")
@XmlAccessorType(XmlAccessType.NONE)
public class Club {

    @XmlElementWrapper(name = "ATHLETES")
    @XmlElement(name = "ATHLETE")
    public List<Athlete> athletes;
    @XmlAttribute(name = "code")
    public String code;
    @XmlElement(name = "CONTACT")
    public Contact contact;
    @XmlAttribute(name = "name", required = true)
    public String name;
    @XmlAttribute(name = "name.en")
    public String nameEn;
    @XmlAttribute(name = "nation")
    public Nation nation;
    @XmlAttribute(name = "number")
    public int number;
    @XmlElement(name = "OFFICIAL")
    @XmlElementWrapper(name = "OFFICIALS")
    public List<Official> officials;
    @XmlAttribute(name = "region")
    public String region;
    @XmlElement(name = "RELAY")
    @XmlElementWrapper(name = "RELAYS")
    public List<RelayMeet> relays;
    @XmlAttribute(name = "shortname")
    public String shortname;
    @XmlAttribute(name = "shortname.en")
    public String shortnameEn;
    @XmlAttribute(name = "swrid")
    public String swrid;
    @XmlAttribute(name = "type")
    public TypeClub type;

    @XmlType
    @XmlEnum
    public enum TypeClub {
        @XmlEnumValue("CLUB")CLUB,
        @XmlEnumValue("NATIONALTEAM")NATIONALTEAM,
        @XmlEnumValue("REGIONALTEAM")REGIONALTEAM,
        @XmlEnumValue("UNATTACHED")UNATTACHED
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void setAthletes(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

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

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Official> getOfficials() {
        return officials;
    }

    public void setOfficials(List<Official> officials) {
        this.officials = officials;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<RelayMeet> getRelays() {
        return relays;
    }

    public void setRelays(List<RelayMeet> relays) {
        this.relays = relays;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getShortnameEn() {
        return shortnameEn;
    }

    public void setShortnameEn(String shortnameEn) {
        this.shortnameEn = shortnameEn;
    }

    public String getSwrid() {
        return swrid;
    }

    public void setSwrid(String swrid) {
        this.swrid = swrid;
    }

    public TypeClub getType() {
        return type;
    }

    public void setType(TypeClub type) {
        this.type = type;
    }
}
