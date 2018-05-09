package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TIMESTANDARDREF")
public class TimeStandardRef {
    @XmlAttribute(name = "timestandardlistid", required = true)
    public int timestandardlistid;
    @XmlElement(name = "FEE")
    public Fee fee;
    @XmlAttribute(name = "marker")
    public String marker;
}
