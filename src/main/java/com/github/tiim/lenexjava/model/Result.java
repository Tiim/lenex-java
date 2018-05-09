package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.ReactionTimeAdapter;
import com.github.tiim.lenexjava.adapder.SwimTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "RESULT")
public class Result {
    @XmlAttribute(name = "comment")
    public String comment;
    @XmlAttribute(name = "eventid", required = true)
    public int eventid;
    @XmlAttribute(name = "heatid")
    public int heatid;
    @XmlAttribute(name = "lane")
    public int lane;
    @XmlAttribute(name = "points")
    public int points;
    @XmlJavaTypeAdapter(ReactionTimeAdapter.class)
    @XmlAttribute(name = "reactiontime")
    public ReactionTime reactionTime;
    @XmlElement(name = "RELAYPOSITIONS")
    public RelayPositions relayPositions;
    @XmlAttribute(name = "resultid", required = true)
    public int resultid;
    @XmlAttribute(name = "status")
    public StatusResult status;
    @XmlElement(name = "SPLITS")
    public Splits splits;
    @XmlJavaTypeAdapter(SwimTimeAdapter.class)
    @XmlAttribute(name = "swimtime")
    public SwimTime swimTime;

    @XmlType
    @XmlEnum
    public enum StatusResult {
        EXH,
        DSQ,
        DNS,
        DNF,
        SICK,
        WDR
    }
}
