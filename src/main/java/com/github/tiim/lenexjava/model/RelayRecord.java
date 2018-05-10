package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.*;
import java.util.Collections;
import java.util.List;

@XmlRootElement(name = "RELAY")
@XmlAccessorType(XmlAccessType.NONE)
public class RelayRecord {
    @XmlElement(name = "CLUB")
    public Club club;
    @XmlAttribute(name = "name")
    public String name;
    @XmlElement(name = "RELAYPOSITION")
    @XmlElementWrapper(name = "RELAYPOSITIONS")
    public List<RelayPosition> relayPositions;

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RelayPosition> getRelayPositions() {
        if (relayPositions == null) {
            return Collections.emptyList();
        }
        return relayPositions;
    }

    public void setRelayPositions(List<RelayPosition> relayPositions) {
        this.relayPositions = relayPositions;
    }
}
