package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum
public enum Course {
    @XmlEnumValue("LCM")LCM,
    @XmlEnumValue("SCM")SCM,
    @XmlEnumValue("SCY")SCY,
    @XmlEnumValue("SCM16")SCM16,
    @XmlEnumValue("SCM20")SCM20,
    @XmlEnumValue("SCM33")SCM33,
    @XmlEnumValue("SCY20")SCY20,
    @XmlEnumValue("SCY27")SCY27,
    @XmlEnumValue("SCY33")SCY33,
    @XmlEnumValue("SCY36")SCY36,
    @XmlEnumValue("OPEN")OPEN;
}
