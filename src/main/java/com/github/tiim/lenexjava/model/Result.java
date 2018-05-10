package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.ReactionTimeAdapter;
import com.github.tiim.lenexjava.adapder.SwimTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

@XmlRootElement(name = "RESULT")
@XmlAccessorType(XmlAccessType.NONE)
public class Result {
    @XmlAttribute(name = "comment")
    public String comment;
    @XmlAttribute(name = "eventid", required = true)
    public int eventid;
    @XmlAttribute(name = "heatid")
    public int heatid;
    @XmlAttribute(name = "lane")
    public int lane;
    @XmlAttribute(name = "points")
    public int points;
    @XmlJavaTypeAdapter(ReactionTimeAdapter.class)
    @XmlAttribute(name = "reactiontime")
    public ReactionTime reactionTime;
    @XmlElement(name = "RELAYPOSITION")
    @XmlElementWrapper(name = "RELAYPOSITIONS")
    public List<RelayPosition> relayPositions;
    @XmlAttribute(name = "resultid", required = true)
    public int resultid;
    @XmlAttribute(name = "status")
    public StatusResult status;
    @XmlElement(name = "SPLIT")
    @XmlElementWrapper(name = "SPLITS")
    public List<Split> splits;
    @XmlJavaTypeAdapter(SwimTimeAdapter.class)
    @XmlAttribute(name = "swimtime")
    public SwimTime swimTime;

    @XmlType
    @XmlEnum
    public enum StatusResult {
        EXH,
        DSQ,
        DNS,
        DNF,
        SICK,
        WDR
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    public int getHeatid() {
        return heatid;
    }

    public void setHeatid(int heatid) {
        this.heatid = heatid;
    }

    public int getLane() {
        return lane;
    }

    public void setLane(int lane) {
        this.lane = lane;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public ReactionTime getReactionTime() {
        return reactionTime;
    }

    public void setReactionTime(ReactionTime reactionTime) {
        this.reactionTime = reactionTime;
    }

    public List<RelayPosition> getRelayPositions() {
        return relayPositions;
    }

    public void setRelayPositions(List<RelayPosition> relayPositions) {
        this.relayPositions = relayPositions;
    }

    public int getResultid() {
        return resultid;
    }

    public void setResultid(int resultid) {
        this.resultid = resultid;
    }

    public StatusResult getStatus() {
        return status;
    }

    public void setStatus(StatusResult status) {
        this.status = status;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

    public SwimTime getSwimTime() {
        return swimTime;
    }

    public void setSwimTime(SwimTime swimTime) {
        this.swimTime = swimTime;
    }
}
