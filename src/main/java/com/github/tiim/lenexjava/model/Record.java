package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.SwimTimeAdapter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

@XmlRootElement(name = "RECORD")
public class Record {
    @XmlElement(name = "ATHLETE")
    public Athlete athlete;
    @XmlAttribute(name = "comment")
    public String comment;
    @XmlElement(name = "MEETINFO")
    public MeetInfoRecord meetInfo;
    @XmlElement(name = "RELAY")
    public RelayRecord relay;
    @XmlElement(name = "SPLIT")
    @XmlElementWrapper(name = "SPLITS")
    public List<Split> splits;
    @XmlElement(name = "SWIMSTYLE", required = true)
    public SwimStyle swimStyle;
    @XmlJavaTypeAdapter(SwimTimeAdapter.class)
    @XmlAttribute(name = "swimtime", required = true)
    public SwimTime swimtime;
    @XmlAttribute(name = "status")
    public String status;
}
