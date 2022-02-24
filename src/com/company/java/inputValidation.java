package com.company.java;

import java.util.regex.Pattern;

public class inputValidation {

    //https://stackoverflow.com/questions/15805555/java-regex-to-validate-full-name-allow-only-spaces-and-letters
    static boolean checkName(String name){
        String regex = "^[\\p{L} .'-]+$";
        return Pattern.matches(regex, name);
    }

    // ref: https://howtodoinjava.com/java/regex/java-regex-validate-email-address/
    static boolean checkEmail(String email){
        String regex = "^(.+)@(.+)$";
        return Pattern.matches(regex, email);
    }

    //https://www.tutorialspoint.com/regular-expression-a-b-metacharacter-in-java
    static boolean checkGender(String gender){
        // IntelliJ recommended a change from "M|F|O"
        String regex = "[MFO]";
        return Pattern.matches(regex, gender);
    }

    //https://stackoverflow.com/questions/13473523/regex-number-between-1-and-100
    static boolean checkAge(String age){
        String regex = "^[1-9]$|^[1-9][0-9]$|^(100)$";
        return Pattern.matches(regex, age);
    }

    // https://www.geeksforgeeks.org/java-program-to-check-for-a-valid-mobile-number/
    static boolean checkNumber(String number){
        String regex = "^\\d{10}$";
        return Pattern.matches(regex, number);
    }

    //https://www.tutorialspoint.com/accepting-date-strings-mm-dd-yyyy-format-using-java-regex
    static boolean checkDate(String date){
        String regex = "^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
        return Pattern.matches(regex, date);
    }

    //https://regexland.com/regex-time-am-pm/
    static boolean checkDeparture(String departure){
        String regex = "^(0?[1-9]|1[0-2]):([0-5]\\d)\\s?((?:A|P)\\.?M\\.?)$";
        return Pattern.matches(regex, departure);
    }
}
