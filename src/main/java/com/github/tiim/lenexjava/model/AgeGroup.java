package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.*;
import java.util.Collections;
import java.util.List;

@XmlRootElement(name = "AGEGROUP")
@XmlAccessorType(XmlAccessType.NONE)
public class AgeGroup {

    @XmlAttribute(name = "agegroupid", required = true)
    private int agegroup;
    @XmlAttribute(name = "agemax", required = true)
    private int agemax;
    @XmlAttribute(name = "agemin", required = true)
    private int agemin;
    @XmlAttribute(name = "gender")
    private Gender gender;
    @XmlAttribute(name = "calculate")
    private Calculate calculate;
    /**
     * Only 1-15, 20,34,49 allowed
     */
    @XmlAttribute(name = "handicap")
    private int handicap;
    @XmlAttribute(name = "levelmax")
    private String levelmax;
    @XmlAttribute(name = "levelmin")
    private String levelmin;
    @XmlAttribute(name = "levels")
    private String levels;
    @XmlAttribute(name = "mame")
    private String name;
    @XmlElement(name = "RANKING")
    @XmlElementWrapper(name = "RANKINGS")
    private List<Ranking> rankings;

    @XmlType
    @XmlEnum
    public enum Calculate {
        @XmlEnumValue("SINGLE") SINGLE,
        @XmlEnumValue("TOTAL") TOTAL
    }

    public int getAgegroup() {
        return agegroup;
    }

    public void setAgegroup(int agegroup) {
        this.agegroup = agegroup;
    }

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Calculate getCalculate() {
        return calculate;
    }

    public void setCalculate(Calculate calculate) {
        this.calculate = calculate;
    }

    public int getHandicap() {
        return handicap;
    }

    public void setHandicap(int handicap) {
        this.handicap = handicap;
    }

    public String getLevelmax() {
        return levelmax;
    }

    public void setLevelmax(String levelmax) {
        this.levelmax = levelmax;
    }

    public String getLevelmin() {
        return levelmin;
    }

    public void setLevelmin(String levelmin) {
        this.levelmin = levelmin;
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ranking> getRankings() {
        if (rankings == null) {
            return Collections.emptyList();
        }
        return rankings;
    }

    public void setRankings(List<Ranking> rankings) {
        this.rankings = rankings;
    }
}
