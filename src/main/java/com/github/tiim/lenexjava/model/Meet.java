package com.github.tiim.lenexjava.model;


import com.github.tiim.lenexjava.adapder.LocalDateAdapter;
import com.github.tiim.lenexjava.adapder.LocalTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.time.LocalTime;

@XmlRootElement(name = "MEET")
public class Meet {

    @XmlElement(name = "AGEDATE")
    public AgeDate ageDate;
    @XmlAttribute(name = "altitude")
    public int altitude;
    @XmlAttribute(name = "city", required = true)
    public String city;
    @XmlAttribute(name = "city.en")
    public String cityEn;
    @XmlElement(name = "CLUBS")
    public Clubs clubs;
    @XmlElement(name = "CONTACT")
    public Contact contact;
    @XmlAttribute(name = "course")
    public Course course;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlAttribute(name = "deadline")
    public LocalDate deadline;
    @XmlJavaTypeAdapter(LocalTimeAdapter.class)
    @XmlAttribute(name = "deadlinetime")
    public LocalTime deadlineTime;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlAttribute(name = "entrystartdate")
    public LocalDate entryStartDate;
    @XmlAttribute(name = "entrytype")
    public EntryType entryType;
    @XmlElement(name = "FEES")
    public Fees fees;
    @XmlAttribute(name = "hostclub")
    public String hostclub;
    @XmlAttribute(name = "hostclub.url")
    public String hostclubUrl;
    @XmlAttribute(name = "maxentries")
    public int maxEntries;
    @XmlAttribute(name = "name", required = true)
    public String name;
    @XmlAttribute(name = "name.en")
    public String nameEn;
    @XmlAttribute(name = "nation", required = true)
    public Nation nation;
    @XmlAttribute(name = "number")
    public String number;
    @XmlAttribute(name = "organizer")
    public String organizer;
    @XmlAttribute(name = "organizer.url")
    public String organizerUrl;
    @XmlElement(name = "POINTTABLE")
    public PointTable pointTable;
    @XmlElement(name = "POOL")
    public Pool pool;
    @XmlElement(name = "QUALIFY")
    public Qualify qualify;
    @XmlAttribute(name = "result.url")
    public String resultUrl;
    @XmlElement(name = "SESSIONS", required = true)
    public Sessions sessions;
    @XmlAttribute(name = "state")
    public String state;
    @XmlAttribute(name = "swrid")
    public String uid;
    @XmlAttribute(name = "timing")
    public Timing timing;
    @XmlAttribute(name = "type")
    public String type;

    @XmlType
    @XmlEnum
    public enum EntryType {
        @XmlEnumValue("OPEN")
        OPEN,
        @XmlEnumValue("INVITATION")
        INVITATION
    }
}
