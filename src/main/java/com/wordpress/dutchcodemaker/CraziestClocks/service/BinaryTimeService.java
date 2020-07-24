package com.wordpress.dutchcodemaker.CraziestClocks.service;

import java.time.LocalTime;

public class BinaryTimeService {

    public static String getTime(LocalTime rawTime) {
        String timeText = "";
        double halfTimeSeconds = rawTime.getSecond() + 60*rawTime.getMinute() + 3600*rawTime.getHour();
        double fraction = halfTimeSeconds/86400;
        Double binFraction = new Double(fraction*Math.pow(2, 16));
        for (int i = 0; i <16; i++) {
            boolean lamp = Math.floor(binFraction) % 2 == 0;
            binFraction = Math.floor(binFraction/2.0);
            timeText += lamp ? "." : "X";
        }
        return timeText;
    }
}
