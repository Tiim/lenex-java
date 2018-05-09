package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.ReactionTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
public class RelayPosition {
    @XmlElement(name = "ATHLETE")
    public Athlete athlete;
    @XmlAttribute(name = "athleteid")
    public int athleteid;
    @XmlElement(name = "MEETINFO")
    public MeetInfoEntry meetinfo;
    @XmlAttribute(name = "number", required = true)
    public int number;
    @XmlJavaTypeAdapter(ReactionTimeAdapter.class)
    @XmlAttribute(name = "reactiontime")
    public ReactionTime reactionTime;
    @XmlAttribute(name = "status")
    public StatusRelayPosition status;

    @XmlType
    @XmlEnum
    public enum StatusRelayPosition {
        DSQ, DNF
    }
}
