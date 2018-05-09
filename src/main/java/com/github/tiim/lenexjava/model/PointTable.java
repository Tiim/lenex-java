package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "POINTTABLE")
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
}
