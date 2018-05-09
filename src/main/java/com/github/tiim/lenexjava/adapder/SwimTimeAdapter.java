package com.github.tiim.lenexjava.adapder;

import com.github.tiim.lenexjava.model.SwimTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SwimTimeAdapter extends XmlAdapter<String, SwimTime> {

    private static final Pattern PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})\\.(\\d{1,2})");
    //HH:MM:SS.ss

    @Override
    public SwimTime unmarshal(String v) throws Exception {
        Matcher m = PATTERN.matcher(v);
        if (!m.matches()) throw new IllegalArgumentException();
        return new SwimTime(Integer.parseInt(m.group(1)), Integer.parseInt(m.group(2)),
                Integer.parseInt(m.group(3)), Integer.parseInt(m.group(4)));
    }

    @Override
    public String marshal(SwimTime v) throws Exception {
        return v.toString();
    }
}
