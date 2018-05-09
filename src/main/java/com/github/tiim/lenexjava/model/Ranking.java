package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RANKING")
public class Ranking {
    @XmlAttribute(name = "order")
    public int order;
    @XmlAttribute(name = "place", required = true)
    public int place;
    @XmlAttribute(name = "resultid", required = true)
    public int resultid;
}
