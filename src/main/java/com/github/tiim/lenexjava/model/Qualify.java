package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

@XmlRootElement(name = "QUALIFY")
public class Qualify {
    @XmlAttribute(name = "conversion")
    public Conversion conversion;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlAttribute(name = "from", required = true)
    public LocalDate from;
    @XmlAttribute(name = "percent")
    public int percent;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlAttribute(name = "until")
    public LocalDate until;

    @XmlType
    @XmlEnum
    public enum Conversion {
        NONE, FINA_POINTS, PERCENT_LINEAR, NON_CONFORMING_LAST
    }
}
