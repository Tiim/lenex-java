package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "TIMESTANDARDREF")
@XmlAccessorType(XmlAccessType.NONE)
public class TimeStandardRef {
    @XmlAttribute(name = "timestandardlistid", required = true)
    public int timestandardlistid;
    @XmlElement(name = "FEE")
    public Fee fee;
    @XmlAttribute(name = "marker")
    public String marker;

    public int getTimestandardlistid() {
        return timestandardlistid;
    }

    public void setTimestandardlistid(int timestandardlistid) {
        this.timestandardlistid = timestandardlistid;
    }

    public Fee getFee() {
        return fee;
    }

    public void setFee(Fee fee) {
        this.fee = fee;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }
}
