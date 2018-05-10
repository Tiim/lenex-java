package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.LocalDateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.List;

@XmlRootElement(name = "RECORDLIST")
@XmlAccessorType(XmlAccessType.NONE)
public class RecordList {
    @XmlElement(name = "AGEGROUP")
    public AgeGroup ageGroup;
    @XmlAttribute(name = "course", required = true)
    public Course course;
    @XmlAttribute(name = "gender", required = true)
    public Gender gender;
    /**
     * Only 1-15, 20, 34,49 allowed.
     */
    @XmlAttribute(name = "handicap")
    public int handicap;
    @XmlAttribute(name = "name", required = true)
    public String name;
    @XmlAttribute(name = "nation")
    public String nation;
    @XmlAttribute(name = "order")
    public int order;
    @XmlElement(name = "RECORD")
    @XmlElementWrapper(name = "RECORDS", required = true)
    public List<Record> records;
    @XmlAttribute(name = "region")
    public String region;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlAttribute(name = "updated")
    public LocalDate updated;
    @XmlAttribute(name = "type")
    public String type;

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getHandicap() {
        return handicap;
    }

    public void setHandicap(int handicap) {
        this.handicap = handicap;
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

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public LocalDate getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDate updated) {
        this.updated = updated;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
