package com.github.tiim.lenexjava.model;

import javax.xml.bind.annotation.*;
import java.util.Collections;
import java.util.List;

@XmlRootElement(name = "LENEX")
@XmlAccessorType(XmlAccessType.NONE)
public class Lenex {

    @XmlElement(name = "CONSTRUCTOR", required = true)
    private Constructor constructor;

    @XmlElement(name = "MEET")
    @XmlElementWrapper(name = "MEETS")
    private List<Meet> meets;

    @XmlElement(name = "RECORDLIST")
    @XmlElementWrapper(name = "RECORDLISTS")
    private List<RecordList> recordLists;

    @XmlElement(name = "TIMESTANDARDLIST")
    @XmlElementWrapper(name = "TIMESTANDARDLISTS")
    private List<TimeStandardList> timeStandardLists;

    @XmlAttribute(name = "version", required = true)
    private String version;

    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }

    public List<Meet> getMeets() {
        if (meets == null) {
            return Collections.emptyList();
        }
        return meets;
    }

    public void setMeets(List<Meet> meets) {
        this.meets = meets;
    }

    public List<RecordList> getRecordLists() {
        if (recordLists == null) {
            return Collections.emptyList();
        }
        return recordLists;
    }

    public void setRecordLists(List<RecordList> recordLists) {
        this.recordLists = recordLists;
    }

    public List<TimeStandardList> getTimeStandardLists() {
        if (timeStandardLists == null) {
            return Collections.emptyList();
        }
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
