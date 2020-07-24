package com.wordpress.dutchcodemaker.CraziestClocks.service;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTimeServiceTest {

    @Test
    public static void testBinaryTime() {
        String text = BinaryTimeService.getTime(LocalTime.of(12, 0));

        assertEquals("...............X", text, "");
    }

}