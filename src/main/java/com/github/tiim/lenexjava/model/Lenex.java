package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "LENEX")
@XmlAccessorType(XmlAccessType.NONE)
public class Lenex {

    @XmlElement(name = "CONSTRUCTOR", required = true)
    public Constructor constructor;

    @XmlElement(name = "MEET")
    @XmlElementWrapper(name = "MEETS")
    public List<Meet> meets;

    @XmlElement(name = "RECORDLIST")
    @XmlElementWrapper(name = "RECORDLISTS")
    public List<RecordList> recordLists;

    @XmlElement(name = "TIMESTANDARDLIST")
    @XmlElementWrapper(name = "TIMESTANDARDLISTS")
    public List<TimeStandardList> timeStandardLists;

    @XmlAttribute(name = "version", required = true)
    public String version;

    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }

    public List<Meet> getMeets() {
        return meets;
    }

    public void setMeets(List<Meet> meets) {
        this.meets = meets;
    }

    public List<RecordList> getRecordLists() {
        return recordLists;
    }

    public void setRecordLists(List<RecordList> recordLists) {
        this.recordLists = recordLists;
    }

    public List<TimeStandardList> getTimeStandardLists() {
        return timeStandardLists;
    }

    public void setTimeStandardLists(List<TimeStandardList> timeStandardLists) {
        this.timeStandardLists = timeStandardLists;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
