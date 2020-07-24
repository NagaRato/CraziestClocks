package com.wordpress.dutchcodemaker.CraziestClocks.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class VerballyTimeServiceTest {

    @Test
    public void TestVerballyTimeService() {
        assertEquals("Het is twaalf uur `s middags.", VerballyTimeService.getVerballyTime(LocalTime.of(12, 1)));
        assertEquals("Het is twaalf uur `s ochtends.", VerballyTimeService.getVerballyTime(LocalTime.of(11, 59)));
        assertEquals("Het is drie uur `s middags.", VerballyTimeService.getVerballyTime(LocalTime.of(15, 2)));
        assertEquals("Het is half elf `s ochtends.", VerballyTimeService.getVerballyTime(LocalTime.of(10, 31)));
        assertEquals("Het is kwart over vijf `s nachts.", VerballyTimeService.getVerballyTime(LocalTime.of(5, 13)));
        assertEquals("Het is kwart voor zeven `s avonds.", VerballyTimeService.getVerballyTime(LocalTime.of(18, 44)));
        assertEquals("Het is vijf over twee `s middags.", VerballyTimeService.getVerballyTime(LocalTime.of(14, 07)));
        assertEquals("Het is tien voor tien `s avonds.", VerballyTimeService.getVerballyTime(LocalTime.of(21, 49)));
        assertEquals("Het is vijf voor drie `s middags.", VerballyTimeService.getVerballyTime(LocalTime.of(14, 56)));
        assertEquals("Het is tien over zeven `s ochtends.", VerballyTimeService.getVerballyTime(LocalTime.of(7,9)));
        assertEquals("Het is vijf over half twee `s middags.", VerballyTimeService.getVerballyTime(LocalTime.of(13, 37)));
        assertEquals("Het is tien over half negen `s avonds.", VerballyTimeService.getVerballyTime(LocalTime.of(20,38)));
        assertEquals("Het is vijf voor half twaalf `s avonds.", VerballyTimeService.getVerballyTime(LocalTime.of(23,27)));
        assertEquals("Het is tien voor half een `s middags.", VerballyTimeService.getVerballyTime(LocalTime.of(12, 19)));
    }
}