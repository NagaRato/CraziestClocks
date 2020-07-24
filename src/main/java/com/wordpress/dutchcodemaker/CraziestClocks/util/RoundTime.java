package com.wordpress.dutchcodemaker.CraziestClocks.util;

import java.time.LocalTime;

public class RoundTime {
    public static LocalTime roundToMultipleMinutes(LocalTime timeToRound, int precision) {
        int roundedMinutes = (int) roundToMultiple(timeToRound.getMinute(), precision);
        int roundedHours = timeToRound.getHour();
        if (roundedMinutes >= 60) {
            roundedMinutes = roundedMinutes - 60;
            roundedHours = roundedHours + 1;
        }
        LocalTime roundedTime = LocalTime.of(roundedHours, roundedMinutes);
        return roundedTime;
    }

    public static long roundToMultiple(int rawValue, int precision) {
        return Math.round(1.0*rawValue/precision)*precision;
    }
}