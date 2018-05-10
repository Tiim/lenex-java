package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "RELAY")
public class RelayRecord {
    @XmlElement(name = "CLUB")
    public Club club;
    @XmlAttribute(name = "name")
    public String name;
    @XmlElement(name = "RELAYPOSITION")
    @XmlElementWrapper(name = "RELAYPOSITIONS")
    public List<RelayPosition> relayPositions;
}
