package com.github.tiim.lenexjava.model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "RECORDS")
public class Records {
    @XmlElement(name = "RECORD")
    public List<Record> records;
}
