package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.LocalDateAdapter;
import com.github.tiim.lenexjava.adapder.LocalTimeAdapter;
import com.github.tiim.lenexjava.adapder.SwimTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.time.LocalTime;

@XmlRootElement(name = "MEETINFO")
@XmlAccessorType(XmlAccessType.NONE)
public class MeetInfoRecord {
    @XmlAttribute(name = "approved")
    public String approved;
    @XmlAttribute(name = "city", required = true)
    public String city;
    @XmlAttribute(name = "course")
    public Course course;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlAttribute(name = "date", required = true)
    public LocalDate date;
    @XmlJavaTypeAdapter(LocalTimeAdapter.class)
    @XmlAttribute(name = "daytime")
    public LocalTime daytime;
    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "nation", required = true)
    public String nation;
    @XmlElement(name = "POOL")
    public Pool pool;
    @XmlJavaTypeAdapter(SwimTimeAdapter.class)
    @XmlAttribute(name = "qualificationtime")
    public SwimTime qualificationtime;
    @XmlAttribute(name = "state")
    public String state;

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }

    public SwimTime getQualificationtime() {
        return qualificationtime;
    }

    public void setQualificationtime(SwimTime qualificationtime) {
        this.qualificationtime = qualificationtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
