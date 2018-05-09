package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "MEETS")
public class Meets {

    @XmlElement(name = "MEET")
    public List<Meet> meets;
}
