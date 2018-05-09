package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.LocalDateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

@XmlRootElement(name = "AGEDATE")
public class AgeDate {
    @XmlAttribute(name = "type", required = true)
    public TypeAgeDate type;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlAttribute(name = "value", required = true)
    public LocalDate value;

    @XmlType
    @XmlEnum
    public enum TypeAgeDate {
        @XmlEnumValue("YEAR")YEAR,
        @XmlEnumValue("DATE")DATE,
        @XmlEnumValue("POR")POR,
        @XmlEnumValue("CAN.FNQ")CAN_FNQ,
        @XmlEnumValue("LUX")LUX
    }
}
