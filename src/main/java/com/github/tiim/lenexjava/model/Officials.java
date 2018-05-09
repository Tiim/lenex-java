package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "OFFICIALS")
public class Officials {
    @XmlElement(name = "OFFICIAL")
    public List<Official> officials;
}
