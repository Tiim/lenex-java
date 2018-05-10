package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.SwimTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

@XmlRootElement(name = "RECORD")
@XmlAccessorType(XmlAccessType.NONE)
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

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public MeetInfoRecord getMeetInfo() {
        return meetInfo;
    }

    public void setMeetInfo(MeetInfoRecord meetInfo) {
        this.meetInfo = meetInfo;
    }

    public RelayRecord getRelay() {
        return relay;
    }

    public void setRelay(RelayRecord relay) {
        this.relay = relay;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

    public SwimStyle getSwimStyle() {
        return swimStyle;
    }

    public void setSwimStyle(SwimStyle swimStyle) {
        this.swimStyle = swimStyle;
    }

    public SwimTime getSwimtime() {
        return swimtime;
    }

    public void setSwimtime(SwimTime swimtime) {
        this.swimtime = swimtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
