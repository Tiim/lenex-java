package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "TIMESTANDARDLIST")
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

}
