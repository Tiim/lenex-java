package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.LocalTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

@XmlRootElement(name = "EVENT")
@XmlAccessorType(XmlAccessType.NONE)
public class Event implements Comparable<Event> {

    @XmlElement(name = "AGEGROUP")
    @XmlElementWrapper(name = "AGEGROUPS")
    private List<AgeGroup> ageGroups;

    @XmlJavaTypeAdapter(LocalTimeAdapter.class)
    @XmlAttribute(name = "daytime")
    private LocalTime daytime;
    @XmlAttribute(name = "eventid", required = true)
    private int eventid;
    @XmlElement(name = "FEE")
    private Fee fee;
    @XmlAttribute(name = "gender")
    private Gender gender;
    @XmlElement(name = "HEAT")
    @XmlElementWrapper(name = "HEATS")
    private List<Heat> heats;
    @XmlAttribute(name = "maxentries")
    private int maxentries;
    @XmlAttribute(name = "number", required = true)
    private int number;
    @XmlAttribute(name = "order")
    private int order;
    @XmlAttribute(name = "preveventid")
    private int preveventid;
    @XmlAttribute(name = "round")
    private Round round;
    @XmlAttribute(name = "run")
    private int run;
    @XmlElement(name = "SWIMSTYLE", required = true)
    private SwimStyle swimstyle;
    @XmlElement(name = "TIMESTANDARDREF")
    @XmlElementWrapper(name = "TIMESTANDARDREFS")
    private List<TimeStandardRef> timeStandardRefs;
    @XmlAttribute(name = "timing")
    private Timing timing;
    @XmlAttribute(name = "type")
    private TypeEvent type;

    @Override
    public int compareTo(Event o) {
        return daytime.compareTo(o.daytime);
    }

    @XmlType
    @XmlEnum
    public enum Round {
        TIM,
        FHT,
        FIN,
        SEM,
        QUA,
        PRE,
        SOP,
        SOS,
        SOQ
    }

    @XmlType
    @XmlEnum
    public enum TypeEvent {
        @XmlEnumValue("")EMPTY,
        @XmlEnumValue("MASTERS")MASTERS
    }

    public List<AgeGroup> getAgeGroups() {
        if (ageGroups == null) {
            return Collections.emptyList();
        }
        return ageGroups;
    }

    public void setAgeGroups(List<AgeGroup> ageGroups) {
        this.ageGroups = ageGroups;
    }

    public LocalTime getDaytime() {
        return daytime;
    }

    public void setDaytime(LocalTime daytime) {
        this.daytime = daytime;
    }

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    public Fee getFee() {
        return fee;
    }

    public void setFee(Fee fee) {
        this.fee = fee;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Heat> getHeats() {
        if (heats == null) {
            return Collections.emptyList();
        }
        return heats;
    }

    public void setHeats(List<Heat> heats) {
        this.heats = heats;
    }

    public int getMaxentries() {
        return maxentries;
    }

    public void setMaxentries(int maxentries) {
        this.maxentries = maxentries;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getPreveventid() {
        return preveventid;
    }

    public void setPreveventid(int preveventid) {
        this.preveventid = preveventid;
    }

    public Round getRound() {
        return round;
    }

    public void setRound(Round round) {
        this.round = round;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public SwimStyle getSwimstyle() {
        return swimstyle;
    }

    public void setSwimstyle(SwimStyle swimstyle) {
        this.swimstyle = swimstyle;
    }

    public List<TimeStandardRef> getTimeStandardRefs() {
        if (timeStandardRefs == null) {
            return Collections.emptyList();
        }
        return timeStandardRefs;
    }

    public void setTimeStandardRefs(List<TimeStandardRef> timeStandardRefs) {
        this.timeStandardRefs = timeStandardRefs;
    }

    public Timing getTiming() {
        return timing;
    }

    public void setTiming(Timing timing) {
        this.timing = timing;
    }

    public TypeEvent getType() {
        return type;
    }

    public void setType(TypeEvent type) {
        this.type = type;
    }
}
