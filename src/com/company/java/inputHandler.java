package com.company.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.Scanner;


public class inputHandler {

    static BufferedReader keyListen = new BufferedReader(new InputStreamReader(System.in));
    static HashMap<Integer, String> airportList = new HashMap<>();
    static HashMap<Integer, String> coordinateList = new HashMap<>();
    static ArrayList<String> airports = new ArrayList<>();

    static {
        try {
            airports = new ArrayList<>(Files.readAllLines(Paths.get("src/com/company/resources/airportsInService")));
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
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        int targetStringLength = 6;
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            buffer.append(chars.charAt(random.nextInt(chars.length())));
        }
        String bpNum = buffer.toString();
        flight.setBoardingPassNumber(bpNum);
    }
    public static void date(Flight flight) throws IOException {
        String thisDate = keyListen.readLine();
        flight.setDate(thisDate);
    }
    public static void origin(Flight flight) throws IOException {
        for(int i = 0; i < airportList.size(); i++){
            System.out.println(String.valueOf(i+1) + ") " + airportList.get(i));
        }
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        if(selection > 0 && selection < 29){
            String coords = "";
            String airport = "";
            if(airportList.containsKey(selection)){
                airport = airportList.get(selection -1);
                coords = coordinateList.get(selection - 1);
            }
            System.out.println("You have selected: " + airport);
            String thisOrigin = coords;
            flight.setOriginAirport(airport);
            flight.setOrigin(thisOrigin);
        }
        else{
            flight.setOrigin("");
        }
    }
    public static void destination(Flight flight) throws IOException {
        for(int i = 0; i < airportList.size(); i++){
            System.out.println(String.valueOf(i+1) + ") " + airportList.get(i));
        }
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        if(selection > 0 && selection < 29){
            String coords = "";
            String airport = "";
            if(airportList.containsKey(selection)){
                airport = airportList.get(selection -1);
                coords = coordinateList.get(selection - 1);
            }
            System.out.println("You have selected: " + airport);
            String thisDestination = coords;
            flight.setDestinationAirport(airport);
            flight.setDestination(thisDestination);
        }
        else {
            flight.setDestination("");
        }

    }
    public static void eta(Flight flight) throws IOException {
        String thisETA = keyListen.readLine();
        flight.setEta(thisETA);
    }

    public static void departure(Flight flight) throws IOException {
        String thisDeparture = keyListen.readLine();
        flight.setDeparture(thisDeparture);
    }

    public static void ticketPrice(Flight flight, Person person) throws IOException {
        //placel holder until i get the code with distance as a vairiable/method?

        double distance = flight.getDistance();
        double standardPrice = 0.0;
        if(distance <= 1000){
            standardPrice = 100;
        }
        else if(distance > 1000 && distance <= 2000){
            standardPrice = 200;
        }
        else{
            standardPrice = 300;
        };
        double price = TicketDiscount.Discountedticket(standardPrice, person);
        String thisTicketPrice = String.valueOf(price);
        flight.setTicketPrice(thisTicketPrice);
    }

}
