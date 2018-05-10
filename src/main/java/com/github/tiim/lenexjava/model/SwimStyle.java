package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "SWIMSTYLE")
@XmlAccessorType(XmlAccessType.NONE)
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelaycount() {
        return relaycount;
    }

    public void setRelaycount(int relaycount) {
        this.relaycount = relaycount;
    }

    public Stroke getStroke() {
        return stroke;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    public int getSwimstyleid() {
        return swimstyleid;
    }

    public void setSwimstyleid(int swimstyleid) {
        this.swimstyleid = swimstyleid;
    }

    public Technique getTechnique() {
        return technique;
    }

    public void setTechnique(Technique technique) {
        this.technique = technique;
    }
}
