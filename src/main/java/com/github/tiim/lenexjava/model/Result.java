package com.github.tiim.lenexjava.model;

import com.github.tiim.lenexjava.adapder.ReactionTimeAdapter;
import com.github.tiim.lenexjava.adapder.SwimTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Collections;
import java.util.List;

@XmlRootElement(name = "RESULT")
@XmlAccessorType(XmlAccessType.NONE)
public class Result {
    @XmlAttribute(name = "comment")
    private String comment;
    @XmlAttribute(name = "eventid", required = true)
    private int eventid;
    @XmlAttribute(name = "heatid")
    private int heatid;
    @XmlAttribute(name = "lane")
    private int lane;
    @XmlAttribute(name = "points")
    private int points;
    @XmlJavaTypeAdapter(ReactionTimeAdapter.class)
    @XmlAttribute(name = "reactiontime")
    private ReactionTime reactionTime;
    @XmlElement(name = "RELAYPOSITION")
    @XmlElementWrapper(name = "RELAYPOSITIONS")
    private List<RelayPosition> relayPositions;
    @XmlAttribute(name = "resultid", required = true)
    private int resultid;
    @XmlAttribute(name = "status")
    private StatusResult status;
    @XmlElement(name = "SPLIT")
    @XmlElementWrapper(name = "SPLITS")
    private List<Split> splits;
    @XmlJavaTypeAdapter(SwimTimeAdapter.class)
    @XmlAttribute(name = "swimtime")
    private SwimTime swimTime;

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
        if (relayPositions == null) {
            return Collections.emptyList();
        }
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
        if (splits == null) {
            return Collections.emptyList();
        }
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
