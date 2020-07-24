package com.wordpress.dutchcodemaker.CraziestClocks.util;

public class IntToNaturaltext {

    static String[] dutch = new String[]{"nul", "een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "elf", "twaalf"};

    public static String convert(int toconvert) {
        return dutch[toconvert];
    }
}
