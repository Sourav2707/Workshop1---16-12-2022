package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String name = "625017";
        Pattern  pattern = Pattern.compile("^[1-9]?[0-9]{5}$");
        Matcher matcher = pattern.matcher(name);
        System.out.println(matcher.matches());
    }
}
