package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.ReactionTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "RELAYPOSITION")
@XmlAccessorType(XmlAccessType.NONE)
public class RelayPosition {
    @XmlElement(name = "ATHLETE")
    private Athlete athlete;
    @XmlAttribute(name = "athleteid")
    private int athleteid;
    @XmlElement(name = "MEETINFO")
    private MeetInfoEntry meetinfo;
    @XmlAttribute(name = "number", required = true)
    private int number;
    @XmlJavaTypeAdapter(ReactionTimeAdapter.class)
    @XmlAttribute(name = "reactiontime")
    private ReactionTime reactionTime;
    @XmlAttribute(name = "status")
    private StatusRelayPosition status;

    @XmlType
    @XmlEnum
    public enum StatusRelayPosition {
        DSQ, DNF
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public int getAthleteid() {
        return athleteid;
    }

    public void setAthleteid(int athleteid) {
        this.athleteid = athleteid;
    }

    public MeetInfoEntry getMeetinfo() {
        return meetinfo;
    }

    public void setMeetinfo(MeetInfoEntry meetinfo) {
        this.meetinfo = meetinfo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ReactionTime getReactionTime() {
        return reactionTime;
    }

    public void setReactionTime(ReactionTime reactionTime) {
        this.reactionTime = reactionTime;
    }

    public StatusRelayPosition getStatus() {
        return status;
    }

    public void setStatus(StatusRelayPosition status) {
        this.status = status;
    }
}
