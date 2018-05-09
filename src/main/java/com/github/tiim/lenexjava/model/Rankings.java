package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "RANKINGS")
public class Rankings {
    @XmlElement(name = "RANKING")
    public List<Ranking> rankings;
}
