package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "POOL")
@XmlAccessorType(XmlAccessType.NONE)
public class Pool {
    @XmlAttribute(name = "name")
    public String name;
    @XmlAttribute(name = "lanemax")
    public int lanemax;
    @XmlAttribute(name = "lanemin")
    public int lanemin;
    @XmlAttribute(name = "temperature")
    public int temperature;
    @XmlAttribute(name = "type")
    public TypePool type;

    public enum TypePool {
        INDOOR, OUTDOOR, LAKE, OCEAN
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLanemax() {
        return lanemax;
    }

    public void setLanemax(int lanemax) {
        this.lanemax = lanemax;
    }

    public int getLanemin() {
        return lanemin;
    }

    public void setLanemin(int lanemin) {
        this.lanemin = lanemin;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public TypePool getType() {
        return type;
    }

    public void setType(TypePool type) {
        this.type = type;
    }
}
