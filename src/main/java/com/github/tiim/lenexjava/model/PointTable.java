package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "POINTTABLE")
@XmlAccessorType(XmlAccessType.NONE)
public class PointTable {
    @XmlAttribute(name = "name", required = true)
    public String name;
    /**
     * http://www.swimrankings.net/files/Lenex_PointTable.txt
     */
    @XmlAttribute(name = "pointtableid")
    public int pointtableid;
    @XmlAttribute(name = "version", required = true)
    public String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPointtableid() {
        return pointtableid;
    }

    public void setPointtableid(int pointtableid) {
        this.pointtableid = pointtableid;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
