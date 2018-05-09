package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "EVENTS")
public class Events {
    @XmlElement(name = "EVENT")
    public List<Event> events;
}
