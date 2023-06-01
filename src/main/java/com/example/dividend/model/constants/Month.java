package com.example.dividend.model.constants;

public enum Month {
    JAN("Jan", 1),
    FEB("Jan", 2),
    MAR("Jan", 3),
    APR("Jan", 4),
    MAY("Jan", 5),
    JUN("Jan", 6),
    JUL("Jan", 7),
    AUG("Jan", 8),
    SEP("Jan", 9),
    OCT("Jan", 10),
    NOV("Jan", 11),
    DEC("Jan", 12);

    private String s;
    private int number;

    Month(String s, int n) {
        this.s = s;
        this.number = n;
    }

    public static int strToNumber(String s) {
        for (var m: Month.values()) {
            if (m.s.equals(s)) {
                return m.number;
            }
        }
        return -1;
    }
}
