package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.SwimTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Collections;
import java.util.List;

@XmlRootElement(name = "ENTRY")
@XmlAccessorType(XmlAccessType.NONE)
public class Entry {
    @XmlAttribute(name = "agegroupid")
    private int agegroupid;
    @XmlAttribute(name = "entrycourse")
    private Course entrycourse;
    @XmlJavaTypeAdapter(SwimTimeAdapter.class)
    @XmlAttribute(name = "entrytime")
    private SwimTime entrytime;
    @XmlAttribute(name = "eventid", required = true)
    private int eventid;
    @XmlAttribute(name = "heatid")
    private int heatid;
    @XmlAttribute(name = "lane")
    private int lane;
    @XmlElement(name = "MEETINFO")
    private MeetInfoEntry meetinfo;
    @XmlElement(name = "RELAYPOSITION")
    @XmlElementWrapper(name = "RELAYPOSITIONS")
    private List<RelayPosition> relayPositions;
    @XmlAttribute(name = "status")
    private StatusEntry status;

    @XmlType
    @XmlEnum
    public enum StatusEntry {
        EXH,
        RJC,
        SICK,
        WDR
    }

    public int getAgegroupid() {
        return agegroupid;
    }

    public void setAgegroupid(int agegroupid) {
        this.agegroupid = agegroupid;
    }

    public Course getEntrycourse() {
        return entrycourse;
    }

    public void setEntrycourse(Course entrycourse) {
        this.entrycourse = entrycourse;
    }

    public SwimTime getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(SwimTime entrytime) {
        this.entrytime = entrytime;
    }

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    public int getHeatid() {
        return heatid;
    }

    public void setHeatid(int heatid) {
        this.heatid = heatid;
    }

    public int getLane() {
        return lane;
    }

    public void setLane(int lane) {
        this.lane = lane;
    }

    public MeetInfoEntry getMeetinfo() {
        return meetinfo;
    }

    public void setMeetinfo(MeetInfoEntry meetinfo) {
        this.meetinfo = meetinfo;
    }

    public List<RelayPosition> getRelayPositions() {
        if (relayPositions == null) {
            return Collections.emptyList();
        }
        return relayPositions;
    }

    public void setRelayPositions(List<RelayPosition> relayPositions) {
        this.relayPositions = relayPositions;
    }

    public StatusEntry getStatus() {
        return status;
    }

    public void setStatus(StatusEntry status) {
        this.status = status;
    }
}
