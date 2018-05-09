package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "POOL")
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
}
