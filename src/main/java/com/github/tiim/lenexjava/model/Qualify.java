package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.LocalDateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

@XmlRootElement(name = "QUALIFY")
@XmlAccessorType(XmlAccessType.NONE)
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

    public Conversion getConversion() {
        return conversion;
    }

    public void setConversion(Conversion conversion) {
        this.conversion = conversion;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public LocalDate getUntil() {
        return until;
    }

    public void setUntil(LocalDate until) {
        this.until = until;
    }
}
