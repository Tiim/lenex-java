package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "TIMESTANDARDREFS")
public class TimeStandardRefs {
    @XmlElement(name = "TIMESTANDARDREF")
    public List<TimeStandardRef> timeStandardRefs;
}
