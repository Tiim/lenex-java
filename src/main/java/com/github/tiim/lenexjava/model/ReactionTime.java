package com.github.tiim.lenexjava.model;

import java.time.Duration;

public class ReactionTime {
    public final int time;

    public ReactionTime(int time) {
        this.time = time;
    }

    public Duration asDuration() {
        return Duration.ofMillis(time * 10L);
    }

    public int getTime() {
        return time;
    }
}
