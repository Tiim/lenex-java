package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.LocalDateAdapter;
import com.github.tiim.lenexjava.adapder.LocalTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@XmlRootElement(name = "SESSION")
@XmlAccessorType(XmlAccessType.NONE)
public class Session implements Comparable<Session> {
    @XmlAttribute(name = "course")
    public Course course;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlAttribute(name = "date", required = true)
    public LocalDate date;
    @XmlJavaTypeAdapter(LocalTimeAdapter.class)
    @XmlAttribute(name = "daytime")
    public LocalTime daytime;
    @XmlElementWrapper(name = "EVENTS", required = true)
    @XmlElement(name = "EVENT", required = true)
    public List<Event> events;
    @XmlElement(name = "FEE")
    @XmlElementWrapper(name = "FEES")
    public List<Fee> fees;
    @XmlElement(name = "JUDGE")
    @XmlElementWrapper(name = "JUDGES")
    public List<Judge> judges;
    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "number", required = true)
    public int number;
    @XmlJavaTypeAdapter(LocalTimeAdapter.class)
    @XmlAttribute(name = "officialmeeting")
    public LocalTime officialmeeting;
    @XmlElement(name = "POOL")
    public Pool pool;
    @XmlJavaTypeAdapter(LocalTimeAdapter.class)
    @XmlAttribute(name = "teamleadermeeting")
    public LocalTime teamleadermeeting;
    @XmlJavaTypeAdapter(LocalTimeAdapter.class)
    @XmlAttribute(name = "warmupfrom")
    public LocalTime warmupfrom;
    @XmlJavaTypeAdapter(LocalTimeAdapter.class)
    @XmlAttribute(name = "warmupuntil")
    public LocalTime warmupuntil;

    @Override
    public int compareTo(Session o) {
        int comp = date.compareTo(o.date) * 10_000;
        if (daytime != null && o.daytime != null) {
            comp += daytime.compareTo(o.daytime);
        }
        return comp;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getDaytime() {
        return daytime;
    }

    public void setDaytime(LocalTime daytime) {
        this.daytime = daytime;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Fee> getFees() {
        return fees;
    }

    public void setFees(List<Fee> fees) {
        this.fees = fees;
    }

    public List<Judge> getJudges() {
        return judges;
    }

    public void setJudges(List<Judge> judges) {
        this.judges = judges;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalTime getOfficialmeeting() {
        return officialmeeting;
    }

    public void setOfficialmeeting(LocalTime officialmeeting) {
        this.officialmeeting = officialmeeting;
    }

    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }

    public LocalTime getTeamleadermeeting() {
        return teamleadermeeting;
    }

    public void setTeamleadermeeting(LocalTime teamleadermeeting) {
        this.teamleadermeeting = teamleadermeeting;
    }

    public LocalTime getWarmupfrom() {
        return warmupfrom;
    }

    public void setWarmupfrom(LocalTime warmupfrom) {
        this.warmupfrom = warmupfrom;
    }

    public LocalTime getWarmupuntil() {
        return warmupuntil;
    }

    public void setWarmupuntil(LocalTime warmupuntil) {
        this.warmupuntil = warmupuntil;
    }
}
