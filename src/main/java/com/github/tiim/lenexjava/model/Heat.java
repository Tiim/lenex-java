package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.LocalTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalTime;

@XmlRootElement(name = "HEAT")
@XmlAccessorType(XmlAccessType.NONE)
public class Heat {
    @XmlAttribute(name = "agegroupid")
    public int agegroupid;
    @XmlJavaTypeAdapter(LocalTimeAdapter.class)
    @XmlAttribute(name = "daytime")
    public LocalTime daytime;
    @XmlAttribute(name = "final")
    public Final finalType;
    @XmlAttribute(name = "heatid", required = true)
    public int heatid;
    @XmlAttribute(name = "number", required = true)
    public int number;
    @XmlAttribute(name = "order")
    public int order;
    @XmlAttribute(name = "status")
    public StatusHeat status;

    @XmlType
    @XmlEnum
    public enum Final {
        A, B, C, D
    }

    @XmlType
    @XmlEnum
    public enum StatusHeat {
        SEEDED, INOFFICIAL, OFFICIAL
    }

    public int getAgegroupid() {
        return agegroupid;
    }

    public void setAgegroupid(int agegroupid) {
        this.agegroupid = agegroupid;
    }

    public LocalTime getDaytime() {
        return daytime;
    }

    public void setDaytime(LocalTime daytime) {
        this.daytime = daytime;
    }

    public Final getFinalType() {
        return finalType;
    }

    public void setFinalType(Final finalType) {
        this.finalType = finalType;
    }

    public int getHeatid() {
        return heatid;
    }

    public void setHeatid(int heatid) {
        this.heatid = heatid;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public StatusHeat getStatus() {
        return status;
    }

    public void setStatus(StatusHeat status) {
        this.status = status;
    }
}
