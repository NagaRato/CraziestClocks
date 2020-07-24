package com.wordpress.dutchcodemaker.CraziestClocks.service;

import com.wordpress.dutchcodemaker.CraziestClocks.util.IntToNaturaltext;
import com.wordpress.dutchcodemaker.CraziestClocks.util.RoundTime;
import java.time.LocalTime;

public class VerballyTimeService {

    public static String getVerballyTime(LocalTime rawTime) {
        LocalTime roundedTimeNow = RoundTime.roundToMultipleMinutes(rawTime, 5);
        int hour = 0;
        if (roundedTimeNow.getHour() > 12) {
            hour = roundedTimeNow.getHour() - 12;
        } else {
            hour = roundedTimeNow.getHour();
        }
        String textedTime = "Het is ";


        if (roundedTimeNow.getMinute() == 15 || roundedTimeNow.getMinute() == 45) {
            textedTime += "kwart ";
        } else if (roundedTimeNow.getMinute() == 5 || roundedTimeNow.getMinute() == 55 || roundedTimeNow.getMinute() == 35 || roundedTimeNow.getMinute() == 25) {
            textedTime += IntToNaturaltext.convert(5) + " ";
        } else if (roundedTimeNow.getMinute() == 10 || roundedTimeNow.getMinute() == 50 || roundedTimeNow.getMinute() == 40 || roundedTimeNow.getMinute() == 20) {
            textedTime += IntToNaturaltext.convert(10) + " ";
        }

        if (roundedTimeNow.getMinute() > 0 && roundedTimeNow.getMinute() < 20 || roundedTimeNow.getMinute() > 30 && roundedTimeNow.getMinute() <= 40) {
            textedTime += "over ";
        } else if (roundedTimeNow.getMinute() > 15 && roundedTimeNow.getMinute() < 30 || roundedTimeNow.getMinute() > 40 && roundedTimeNow.getMinute() < 60) {
            textedTime += "voor ";
        }

        if (roundedTimeNow.getMinute() >= 20 && roundedTimeNow.getMinute() <= 40) {
            textedTime += "half ";
        }


        if (roundedTimeNow.getMinute() > 17) {
            hour++;
            if (hour > 12) {
                hour -= 12;
            }
            textedTime += IntToNaturaltext.convert(hour);
        } else {
            textedTime += IntToNaturaltext.convert(hour);
        }

        if (roundedTimeNow.getMinute() == 0) {
            textedTime += " uur";
        }

        return textedTime + " " + getQuarterday(rawTime) + ".";
    }

    private static String getQuarterday(LocalTime rawTime) {
        String quarterday;
        if (rawTime.getHour() >= 18) {
            quarterday = "`s avonds";
        } else if (rawTime.getHour() >= 12) {
            quarterday = "`s middags";
        } else if (rawTime.getHour() >= 6) {
            quarterday = "`s ochtends";
        } else {
            quarterday = "`s nachts";
        }
        return quarterday;
    }
}
