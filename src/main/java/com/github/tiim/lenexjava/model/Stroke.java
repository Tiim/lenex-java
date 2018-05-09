package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum
public enum Stroke {
    APNEA,
    BACK,
    BREAST,
    FLY,
    FREE,
    IMMERSION,
    MEDLEY,
    SURFACE,
    UNKNOWN;
}
