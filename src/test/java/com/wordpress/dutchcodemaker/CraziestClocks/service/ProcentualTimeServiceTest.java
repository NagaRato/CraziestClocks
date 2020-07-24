package com.wordpress.dutchcodemaker.CraziestClocks.service;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ProcentualTimeServiceTest {

    @Test
    public static void testProcentualTimeService() {
        double procentualTime = ProcentualTimeService.getTime(LocalTime.of(21, 13));

        assertEquals(884, procentualTime, "");
    }

}