package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "RELAY")
public class RelayMeet {
    @XmlAttribute(name = "agemax", required = true)
    public int agemax;
    @XmlAttribute(name = "agemin", required = true)
    public int agemin;
    @XmlAttribute(name = "agetotalmax", required = true)
    public int agetotalmax;
    @XmlAttribute(name = "agetotalmin", required = true)
    public int agetotalmin;
    @XmlElement(name = "ENTRY")
    @XmlElementWrapper(name = "ENTRIES")
    public List<Entry> entries;
    @XmlAttribute(name = "gender", required = true)
    public Gender gender;
    /**
     * Only 0, 20, 34, 49 allowed.
     */
    @XmlAttribute(name = "handicap")
    public int handicap;
    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "number")
    public int number;
    @XmlElement(name = "RESULT")
    @XmlElementWrapper(name = "RESULTS")
    public List<Result> results;
}
