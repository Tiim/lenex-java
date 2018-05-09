package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "ENTRIES")
public class Entries {
    @XmlElement(name = "ENTRY")
    public List<Entry> entries;
}
