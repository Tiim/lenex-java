package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "FEE")
public class Fee {
    @XmlAttribute(name = "currency")
    public Currency currency;
    @XmlAttribute(name = "type", required = true)
    public TypeFee type;
    @XmlAttribute(name = "value", required = true)
    public int value;

    @XmlType
    @XmlEnum
    public enum TypeFee {
        @XmlEnumValue("CLUB")CLUB,
        @XmlEnumValue("ATHLETE")ATHLETE,
        @XmlEnumValue("RELAY")RELAY,
        @XmlEnumValue("TEAM")TEAM,
        @XmlEnumValue("LATEENTRY.INDIVIDUAL")LATEENTRY_INDIVIDUAL,
        @XmlEnumValue("LATEENTRY.RELAY")LATEENTRY_RELAY
    }
}
