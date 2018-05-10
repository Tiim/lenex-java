package com.github.tiim.lenexjava.model;

import java.time.Duration;

public class SwimTime {
    private final int hour;
    private final int minute;
    private final int second;
    private final int hsec;

    public SwimTime(int hour, int minute, int second, int hsec) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.hsec = hsec;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d.%02d", getHour(), getMinute(), getSecond(), getHsec());
    }

    public Duration asDuration() {
        long milis = getHour() * 60L * 60L * 1000L;
        milis += getMinute() * 60L * 1000L;
        milis += getSecond() * 1000L;
        milis += getHsec() * 10L;
        return Duration.ofMillis(milis);
    }

    public int getHour() {
        return hour;
    }

    public int getHsec() {
        return hsec;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
