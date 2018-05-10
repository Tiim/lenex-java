package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.SwimTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Collections;
import java.util.List;

@XmlRootElement(name = "RECORD")
@XmlAccessorType(XmlAccessType.NONE)
public class Record {
    @XmlElement(name = "ATHLETE")
    private Athlete athlete;
    @XmlAttribute(name = "comment")
    private String comment;
    @XmlElement(name = "MEETINFO")
    private MeetInfoRecord meetInfo;
    @XmlElement(name = "RELAY")
    private RelayRecord relay;
    @XmlElement(name = "SPLIT")
    @XmlElementWrapper(name = "SPLITS")
    private List<Split> splits;
    @XmlElement(name = "SWIMSTYLE", required = true)
    private SwimStyle swimStyle;
    @XmlJavaTypeAdapter(SwimTimeAdapter.class)
    @XmlAttribute(name = "swimtime", required = true)
    private SwimTime swimtime;
    @XmlAttribute(name = "status")
    private String status;

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
        if (splits == null) {
            return Collections.emptyList();
        }
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
