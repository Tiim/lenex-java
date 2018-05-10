package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "CLUB")
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
    @XmlElement(name = "RELAYS")
    public RelaysTeam relays;
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
}
