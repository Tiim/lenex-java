package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "HEATS")
public class Heats {
    @XmlElement(name = "HEAT")
    public List<Heat> heats;
}
