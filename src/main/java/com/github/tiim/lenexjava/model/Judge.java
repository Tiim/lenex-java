package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "JUDGE")
@XmlAccessorType(XmlAccessType.NONE)
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getOfficialid() {
        return officialid;
    }

    public void setOfficialid(int officialid) {
        this.officialid = officialid;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
