package com.wordpress.dutchcodemaker.CraziestClocks.util;

import com.wordpress.dutchcodemaker.CraziestClocks.util.RoundTime;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RoundTimeTests {

    @Test
    public void roundTest1() {
        LocalTime roundedTime = RoundTime.roundToMultipleMinutes(LocalTime.of(20, 1), 5);
        assertTrue(roundedTime.getHour() == 20);
        assertTrue(roundedTime.getMinute() == 0);
    }

    @Test
    public void roundTest2() {
        LocalTime roundedTime = RoundTime.roundToMultipleMinutes(LocalTime.of(20, 3), 5);
        assertTrue(roundedTime.getHour() == 20, "The rounded time did not result in the right hour.");
        assertTrue(roundedTime.getMinute() == 5, "The rounded time did not result in the right minute.");
    }

    @Test
    public void roundTest3() {
        LocalTime roundedTime = RoundTime.roundToMultipleMinutes(LocalTime.of(19, 58), 5);
        assertTrue(roundedTime.getHour() == 20, "The rounded time did not result in the right hour.");
        assertTrue(roundedTime.getMinute() == 0, "The rounded time did not result in the right minute.");
    }
}
