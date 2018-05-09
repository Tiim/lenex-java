package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "LENEX")
public class Lenex {

    @XmlElement(name = "CONSTRUCTOR", required = true)
    public Constructor constructor;

    @XmlElement(name = "MEETS")
    public Meets meets;

    @XmlElement(name = "RECORDLISTS")
    public RecordLists recordLists;

    @XmlElement(name = "TIMESTANDARDLISTS")
    public TimeStandardLists timeStandardLists;

    @XmlAttribute(name = "version", required = true)
    public String version;


}
