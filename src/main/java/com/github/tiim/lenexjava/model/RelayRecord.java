package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RELAY")
public class RelayRecord {
    @XmlElement(name = "CLUB")
    public Club club;
    @XmlAttribute(name = "name")
    public String name;
    @XmlElement(name = "RELAYPOSITIONS")
    public RelayPositions relayPositions;
}
