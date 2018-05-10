package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.SwimTimeAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "SPLIT")
@XmlAccessorType(XmlAccessType.NONE)
public class Split {
    @XmlAttribute(name = "distance", required = true)
    private int distance;
    @XmlJavaTypeAdapter(SwimTimeAdapter.class)
    @XmlAttribute(name = "swimtime", required = true)
    private SwimTime swimTime;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public SwimTime getSwimTime() {
        return swimTime;
    }

    public void setSwimTime(SwimTime swimTime) {
        this.swimTime = swimTime;
    }
}
