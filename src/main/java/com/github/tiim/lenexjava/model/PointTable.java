package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "POINTTABLE")
@XmlAccessorType(XmlAccessType.NONE)
public class PointTable {
    @XmlAttribute(name = "name", required = true)
    private String name;
    @XmlAttribute(name = "pointtableid")
    private int pointtableid;
    @XmlAttribute(name = "version", required = true)
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * http://www.swimrankings.net/files/Lenex_PointTable.txt
     */
    public int getPointtableid() {
        return pointtableid;
    }

    /**
     * http://www.swimrankings.net/files/Lenex_PointTable.txt
     */
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
