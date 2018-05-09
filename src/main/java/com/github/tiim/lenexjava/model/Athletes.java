package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "ATHLETES")
public class Athletes {
    @XmlElement(name = "ATHLETE")
    public List<Athlete> athletes;
}
