package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.LocalTimeAdapter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalTime;

@XmlRootElement(name = "HEAT")
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
}
