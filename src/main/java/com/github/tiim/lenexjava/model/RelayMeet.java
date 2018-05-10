package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.*;
import java.util.Collections;
import java.util.List;

@XmlRootElement(name = "RELAY")
@XmlAccessorType(XmlAccessType.NONE)
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

    public int getAgemax() {
        return agemax;
    }

    public void setAgemax(int agemax) {
        this.agemax = agemax;
    }

    public int getAgemin() {
        return agemin;
    }

    public void setAgemin(int agemin) {
        this.agemin = agemin;
    }

    public int getAgetotalmax() {
        return agetotalmax;
    }

    public void setAgetotalmax(int agetotalmax) {
        this.agetotalmax = agetotalmax;
    }

    public int getAgetotalmin() {
        return agetotalmin;
    }

    public void setAgetotalmin(int agetotalmin) {
        this.agetotalmin = agetotalmin;
    }

    public List<Entry> getEntries() {
        if (entries == null) {
            return Collections.emptyList();
        }
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Result> getResults() {
        if (results == null) {
            return Collections.emptyList();
        }
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
