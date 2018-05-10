package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RANKING")
@XmlAccessorType(XmlAccessType.NONE)
public class Ranking {
    @XmlAttribute(name = "order")
    private int order;
    @XmlAttribute(name = "place", required = true)
    private int place;
    @XmlAttribute(name = "resultid", required = true)
    private int resultid;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getResultid() {
        return resultid;
    }

    public void setResultid(int resultid) {
        this.resultid = resultid;
    }
}
