package com.github.tiim.lenexjava.model;


import com.github.tiim.lenexjava.adapder.LocalDateAdapter;
import com.github.tiim.lenexjava.adapder.LocalTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

@XmlRootElement(name = "MEET")
@XmlAccessorType(XmlAccessType.NONE)
public class Meet {

    @XmlElement(name = "AGEDATE")
    public AgeDate ageDate;
    @XmlAttribute(name = "altitude")
    public int altitude;
    @XmlAttribute(name = "city", required = true)
    public String city;
    @XmlAttribute(name = "city.en")
    public String cityEn;
    @XmlElementWrapper(name = "CLUBS")
    @XmlElement(name = "CLUB")
    public List<Club> clubs;
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
    @XmlElementWrapper(name = "FEES")
    @XmlElement(name = "FEE")
    public List<Fee> fees;
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
    @XmlElement(name = "SESSION")
    @XmlElementWrapper(name = "SESSIONS", required = true)
    public List<Session> sessions;
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

    public AgeDate getAgeDate() {
        return ageDate;
    }

    public void setAgeDate(AgeDate ageDate) {
        this.ageDate = ageDate;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityEn() {
        return cityEn;
    }

    public void setCityEn(String cityEn) {
        this.cityEn = cityEn;
    }

    public List<Club> getClubs() {
        if (clubs == null) {
            return Collections.emptyList();
        }
        return clubs;
    }

    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public LocalTime getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(LocalTime deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public LocalDate getEntryStartDate() {
        return entryStartDate;
    }

    public void setEntryStartDate(LocalDate entryStartDate) {
        this.entryStartDate = entryStartDate;
    }

    public EntryType getEntryType() {
        return entryType;
    }

    public void setEntryType(EntryType entryType) {
        this.entryType = entryType;
    }

    public List<Fee> getFees() {
        if (fees == null) {
            return Collections.emptyList();
        }
        return fees;
    }

    public void setFees(List<Fee> fees) {
        this.fees = fees;
    }

    public String getHostclub() {
        return hostclub;
    }

    public void setHostclub(String hostclub) {
        this.hostclub = hostclub;
    }

    public String getHostclubUrl() {
        return hostclubUrl;
    }

    public void setHostclubUrl(String hostclubUrl) {
        this.hostclubUrl = hostclubUrl;
    }

    public int getMaxEntries() {
        return maxEntries;
    }

    public void setMaxEntries(int maxEntries) {
        this.maxEntries = maxEntries;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getOrganizerUrl() {
        return organizerUrl;
    }

    public void setOrganizerUrl(String organizerUrl) {
        this.organizerUrl = organizerUrl;
    }

    public PointTable getPointTable() {
        return pointTable;
    }

    public void setPointTable(PointTable pointTable) {
        this.pointTable = pointTable;
    }

    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }

    public Qualify getQualify() {
        return qualify;
    }

    public void setQualify(Qualify qualify) {
        this.qualify = qualify;
    }

    public String getResultUrl() {
        return resultUrl;
    }

    public void setResultUrl(String resultUrl) {
        this.resultUrl = resultUrl;
    }

    public List<Session> getSessions() {
        if (sessions == null) {
            return Collections.emptyList();
        }
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Timing getTiming() {
        return timing;
    }

    public void setTiming(Timing timing) {
        this.timing = timing;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
