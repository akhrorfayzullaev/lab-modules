package com.epam.module1;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static   boolean isPositiveNumber(String str) {
        return NumberUtils.isDigits(str);
    }
}
