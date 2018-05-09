package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "SESSIONS")
public class Sessions {
    @XmlElement(name = "SESSION")
    public List<Session> sessions;
}
