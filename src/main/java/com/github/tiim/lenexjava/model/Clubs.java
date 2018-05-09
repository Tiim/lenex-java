package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "CLUBS")
public class Clubs {
    @XmlElement(name = "CLUB")
    public List<Club> clubs;
}
