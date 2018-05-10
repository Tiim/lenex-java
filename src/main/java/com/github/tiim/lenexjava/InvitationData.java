package com.github.tiim.lenexjava;

import com.github.tiim.lenexjava.model.Event;
import com.github.tiim.lenexjava.model.Lenex;
import com.github.tiim.lenexjava.model.Meet;
import com.github.tiim.lenexjava.model.Session;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InvitationData {

    private final Lenex l;

    public InvitationData(Lenex l) {
        this.l = l;
    }

    public List<Event> getEvents(Session s) {
        List<Event> events = s.events;
        Collections.sort(events);
        return events;
    }

    public List<Session> getSessions() {
        List<Session> sessions = new ArrayList<>();
        for (Meet m : l.meets) {
            sessions.addAll(m.sessions);
        }
        Collections.sort(sessions);
        return sessions;
    }
}
