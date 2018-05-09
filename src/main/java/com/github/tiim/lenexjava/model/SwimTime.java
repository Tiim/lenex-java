package com.github.tiim.lenexjava.model;

import java.time.Duration;

public class SwimTime {
    public final int hour;
    public final int minute;
    public final int second;
    public final int hsec;

    public SwimTime(int hour, int minute, int second, int hsec) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.hsec = hsec;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d.%02d", hour, minute, second, hsec);
    }

    public Duration asDuration() {
        long milis = hour * 60L * 60L * 1000L;
        milis += minute * 60L * 1000L;
        milis += second * 1000L;
        milis += hsec * 10L;
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
