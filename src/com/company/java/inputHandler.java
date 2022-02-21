package com.company.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class inputHandler {

    static BufferedReader keyListen = new BufferedReader(new InputStreamReader(System.in));

    public static ArrayList<String> airports() throws IOException {

        return new ArrayList<>(Files.readAllLines(Paths.get("D:\\GenSpark\\GroupProjects" +
                "\\BoardingPass\\BoardingPass\\src\\com\\company\\resources\\airportsInService")));
    }

    // Input for Person
    public static void name(Person person) throws IOException {
        String thisName = keyListen.readLine();
        person.setName(thisName);
    }

    public static void email(Person person) throws IOException {
        String thisEmail = keyListen.readLine();
        person.setEmail(thisEmail);
    }

    public static void phoneNumber(Person person) throws IOException {
        String thisNum = keyListen.readLine();
        person.setPhoneNumber(thisNum);
    }

    public static void gender(Person person) throws IOException {
        String thisGender = keyListen.readLine();
        person.setGender(thisGender);
    }
    public static void age(Person person) throws IOException {
        String thisAge = keyListen.readLine();
        person.setAge(thisAge);
    }

    // Input for Flight
    public static void boardingPassNumber(Flight flight) throws IOException {
        String thisBPNum = keyListen.readLine();
        flight.setBoardingPassNumber(thisBPNum);
    }
    public static void date(Flight flight) throws IOException {
        String thisDate = keyListen.readLine();
        flight.setDate(thisDate);
    }
    public static void origin(Flight flight) throws IOException {
        String thisOrigin = keyListen.readLine();
        flight.setOrigin(thisOrigin);
    }
    public static void destination(Flight flight) throws IOException {
        String thisDestination = keyListen.readLine();
        flight.setDestination(thisDestination);
    }
    public static void eta(Flight flight) throws IOException {
        String thisETA = keyListen.readLine();
        flight.setEta(thisETA);
    }

}
