package com.utils;

public class ConvertUtils {

    public static boolean convertStringToBool(String value) {
        return value.trim().equalsIgnoreCase("true") || value.trim().equalsIgnoreCase("1");
    }
}
