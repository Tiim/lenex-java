package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "LENEX")
public class Lenex {

    @XmlElement(name = "CONSTRUCTOR", required = true)
    public Constructor constructor;

    @XmlElement(name = "MEET")
    @XmlElementWrapper(name = "MEETS")
    public List<Meet> meets;

    @XmlElement(name = "RECORDLIST")
    @XmlElementWrapper(name = "RECORDLISTS")
    public List<RecordList> recordLists;

    @XmlElement(name = "TIMESTANDARDLIST")
    @XmlElementWrapper(name = "TIMESTANDARDLISTS")
    public List<TimeStandardList> timeStandardLists;

    @XmlAttribute(name = "version", required = true)
    public String version;


}
