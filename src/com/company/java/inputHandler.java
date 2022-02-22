package com.company.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;


public class inputHandler {

    static BufferedReader keyListen = new BufferedReader(new InputStreamReader(System.in));
    static HashMap<Integer, String> airportList = new HashMap<>();
    static HashMap<Integer, String> coordinateList = new HashMap<>();
    static ArrayList<String> airports = new ArrayList<>();

    static {
        try {
            airports = new ArrayList<>(Files.readAllLines(Paths.get("D:\\GenSpark\\GroupProjects" +
                        "\\BoardingPass\\BoardingPass\\src\\com\\company\\resources\\airportsInService")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Initialize HashMaps for airports and coordinates
    static {
        for (int i = 0; i < airports.size(); i++) {
            String[] checker = airports.get(i).split("~");
            airportList.put(i, checker[0]);
            coordinateList.put(i, checker[1]);
        }
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
    public static void boardingPassNumber(Flight flight) {
        String aToZ="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; // 36 letter.
        int targetStringLength = 6;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = random.nextInt(aToZ.length());
            buffer.append((char) randomLimitedInt);
        }
        String bpNum = buffer.toString();

        flight.setBoardingPassNumber(bpNum);
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

    public static void departure(Flight flight) throws IOException {
        String thisDeparture = keyListen.readLine();
        flight.setEta(thisDeparture);
    }

}
