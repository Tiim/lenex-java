package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "SWIMSTYLE")
public class SwimStyle {
    @XmlAttribute(name = "code")
    public String code;
    @XmlAttribute(name = "distance", required = true)
    public int distance;
    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "relaycount", required = true)
    public int relaycount;
    @XmlAttribute(name = "stroke", required = true)
    public Stroke stroke;
    @XmlAttribute(name = "swimstyleid")
    public int swimstyleid;
    @XmlAttribute(name = "technique")
    public Technique technique;

    @XmlType
    @XmlEnum
    public enum Technique {
        DIVE,
        GLIDE,
        KICK,
        PULL,
        START,
        TURN
    }
}
