package com.wordpress.dutchcodemaker.CraziestClocks.service;

import java.time.LocalTime;

public class ProcentualTimeService {
    public static double getTime(LocalTime now) {
        return Math.round(LocalTime.now().toSecondOfDay()/86400.0*10000.0)/100.0;
    }
}
