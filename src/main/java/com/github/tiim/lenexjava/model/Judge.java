package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "JUDGE")
public class Judge {

    @XmlAttribute(name = "number")
    public int number;
    @XmlAttribute(name = "officialid", required = true)
    public int officialid;
    @XmlAttribute(name = "role")
    public Role role;

    @XmlType
    @XmlEnum
    public enum Role {
        OTH,
        MDR,
        TDG,
        REF,
        STA,
        ANN,
        JOS,
        CTIK,
        TIK,
        CFIN,
        FIN,
        CIOT,
        IOT,
        FSR,
        COC,
        CREC,
        REC,
        CRS,
        CR,
        MED
    }
}
