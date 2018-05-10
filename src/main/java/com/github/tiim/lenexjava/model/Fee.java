package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "FEE")
@XmlAccessorType(XmlAccessType.NONE)
public class Fee {
    @XmlAttribute(name = "currency")
    private Currency currency;
    @XmlAttribute(name = "type", required = true)
    private TypeFee type;
    @XmlAttribute(name = "value", required = true)
    private int value;

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

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public TypeFee getType() {
        return type;
    }

    public void setType(TypeFee type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
