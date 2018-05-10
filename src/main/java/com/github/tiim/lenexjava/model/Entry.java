package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.SwimTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

@XmlRootElement(name = "ENTRY")
public class Entry {
    @XmlAttribute(name = "agegroupid")
    public int agegroupid;
    @XmlAttribute(name = "entrycourse")
    public Course entrycourse;
    @XmlJavaTypeAdapter(SwimTimeAdapter.class)
    @XmlAttribute(name = "entrytime")
    public SwimTime entrytime;
    @XmlAttribute(name = "eventid", required = true)
    public int eventid;
    @XmlAttribute(name = "heatid")
    public int heatid;
    @XmlAttribute(name = "lane")
    public int lane;
    @XmlElement(name = "MEETINFO")
    public MeetInfoEntry meetinfo;
    @XmlElement(name = "RELAYPOSITION")
    @XmlElementWrapper(name = "RELAYPOSITIONS")
    public List<RelayPosition> relayPositions;
    @XmlAttribute(name = "status")
    public StatusEntry status;

    @XmlType
    @XmlEnum
    public enum StatusEntry {
        EXH,
        RJC,
        SICK,
        WDR
    }
}
