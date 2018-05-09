package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "TIMESTANDARDLISTS")
public class TimeStandardLists {
    @XmlElement(name = "TIMESTANDARDLIST")
    public List<TimeStandardList> timeStandardLists;
}
