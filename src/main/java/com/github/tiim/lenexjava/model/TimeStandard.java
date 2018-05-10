package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.SwimTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "TIMESTANDARD")
@XmlAccessorType(XmlAccessType.NONE)
public class TimeStandard {
    @XmlElement(name = "SWIMSTYLE", required = true)
    public SwimStyle swimStyle;
    @XmlJavaTypeAdapter(SwimTimeAdapter.class)
    @XmlAttribute(name = "swimtime", required = true)
    public SwimTime swimTime;

    public SwimStyle getSwimStyle() {
        return swimStyle;
    }

    public void setSwimStyle(SwimStyle swimStyle) {
        this.swimStyle = swimStyle;
    }

    public SwimTime getSwimTime() {
        return swimTime;
    }

    public void setSwimTime(SwimTime swimTime) {
        this.swimTime = swimTime;
    }
}
