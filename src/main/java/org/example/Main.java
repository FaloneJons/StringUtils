package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String s1 = "Hello World";
        String s2 = "Hello World";
        String s3 = "Hello Worlt";
        String s4 = "Hello world";
        System.out.println(StringUtils.equalsIgnoreCase(s1, s2));
        System.out.println(StringUtils.equalsIgnoreCase(s1, s3));
        System.out.println(StringUtils.equalsIgnoreCase(s1, s4));
    }
}