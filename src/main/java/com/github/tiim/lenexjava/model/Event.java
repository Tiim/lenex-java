package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.LocalTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalTime;
import java.util.List;

@XmlRootElement(name = "EVENT")
public class Event implements Comparable<Event> {

    @XmlElement(name = "AGEGROUP")
    @XmlElementWrapper(name = "AGEGROUPS")
    public List<AgeGroup> ageGroups;

    @XmlJavaTypeAdapter(LocalTimeAdapter.class)
    @XmlAttribute(name = "daytime")
    public LocalTime daytime;
    @XmlAttribute(name = "eventid", required = true)
    public int eventid;
    @XmlElement(name = "FEE")
    public Fee fee;
    @XmlAttribute(name = "gender")
    public Gender gender;
    @XmlElement(name = "HEAT")
    @XmlElementWrapper(name = "HEATS")
    public List<Heat> heats;
    @XmlAttribute(name = "maxentries")
    public int maxentries;
    @XmlAttribute(name = "number", required = true)
    public int number;
    @XmlAttribute(name = "order")
    public int order;
    @XmlAttribute(name = "preveventid")
    public int preveventid;
    @XmlAttribute(name = "round")
    public Round round;
    @XmlAttribute(name = "run")
    public int run;
    @XmlElement(name = "SWIMSTYLE", required = true)
    public SwimStyle swimstyle;
    @XmlElement(name = "TIMESTANDARDREF")
    @XmlElementWrapper(name = "TIMESTANDARDREFS")
    public List<TimeStandardRef> timeStandardRefs;
    @XmlAttribute(name = "timing")
    public Timing timing;
    @XmlAttribute(name = "type")
    public TypeEvent type;

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
}
