package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "TIMESTANDARDLIST")
@XmlAccessorType(XmlAccessType.NONE)
public class TimeStandardList {
    @XmlElement(name = "AGEGROUP")
    public AgeGroup ageGroup;
    @XmlAttribute(name = "course", required = true)
    public Course course;
    @XmlAttribute(name = "gender", required = true)
    public Gender gender;
    /**
     * Only 1-15,20,34,49 allowed.
     */
    @XmlAttribute(name = "handicap")
    public int handicap;
    @XmlAttribute(name = "name", required = true)
    public String name;
    @XmlAttribute(name = "timestandardlistid", required = true)
    public int timeStandardListId;
    @XmlElement(name = "TIMESTANDARD")
    @XmlElementWrapper(name = "TIMESTANDARDS", required = true)
    public List<TimeStandard> timeStandards;
    @XmlAttribute(name = "type")
    public TypeTimeStandardList type;

    @XmlType
    @XmlEnum
    public enum TypeTimeStandardList {
        DEFAULT,
        MAXIMUM,
        MINIMUM
    }

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

    public int getTimeStandardListId() {
        return timeStandardListId;
    }

    public void setTimeStandardListId(int timeStandardListId) {
        this.timeStandardListId = timeStandardListId;
    }

    public List<TimeStandard> getTimeStandards() {
        return timeStandards;
    }

    public void setTimeStandards(List<TimeStandard> timeStandards) {
        this.timeStandards = timeStandards;
    }

    public TypeTimeStandardList getType() {
        return type;
    }

    public void setType(TypeTimeStandardList type) {
        this.type = type;
    }
}
