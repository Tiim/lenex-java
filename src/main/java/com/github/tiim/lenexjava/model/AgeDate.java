package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.LocalDateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

@XmlRootElement(name = "AGEDATE")
@XmlAccessorType(XmlAccessType.NONE)
public class AgeDate {
    @XmlAttribute(name = "type", required = true)
    private TypeAgeDate type;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlAttribute(name = "value", required = true)
    private LocalDate value;

    @XmlType
    @XmlEnum
    public enum TypeAgeDate {
        @XmlEnumValue("YEAR")YEAR,
        @XmlEnumValue("DATE")DATE,
        @XmlEnumValue("POR")POR,
        @XmlEnumValue("CAN.FNQ")CAN_FNQ,
        @XmlEnumValue("LUX")LUX
    }

    public TypeAgeDate getType() {
        return type;
    }

    public void setType(TypeAgeDate type) {
        this.type = type;
    }

    public LocalDate getValue() {
        return value;
    }

    public void setValue(LocalDate value) {
        this.value = value;
    }
}
