package com.github.tiim.lenexjava.adapder;

import com.github.tiim.lenexjava.model.ReactionTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ReactionTimeAdapter extends XmlAdapter<String, ReactionTime> {
    @Override
    public ReactionTime unmarshal(String v) throws Exception {
        return new ReactionTime(Integer.parseInt(v));
    }

    @Override
    public String marshal(ReactionTime v) throws Exception {
        return String.valueOf(v.getTime());
    }
}
