package com.company.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Person passenger = new Person();
    static Flight flight = new Flight();
    static boolean gotName = false;
    static boolean gotEmail = false;
    static boolean gotPhoneNumber = false;
    static boolean gotGender = false;
    static boolean gotAge = false;
    static boolean gotOrigin = false;
    static boolean gotDestination = false;
    static boolean gotDate = false;
    static boolean gotDeparture = false;

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to the Flight Purchase Station!");
        System.out.println("Let's get some information about you before we begin.");
        personalInfo();
        flightDetails();

    }

    private static void personalInfo() throws IOException {

        System.out.println("What is your name? ");

        do {
            try {
                inputHandler.name(passenger);
                if (passenger.getName().equals("")) {
                    throw new InputMismatchException();
                }
                else {
                    gotName = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter a name: ");
            }
        } while (!gotName);

        System.out.println("Alright, " + passenger.getName() + ", what is a valid email" +
                " address for us to contact you at? ");

        do {
            try {
                inputHandler.email(passenger);
                if (passenger.getEmail().equals("")) {
                    throw new InputMismatchException();
                }
                else {
                    gotEmail = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter a valid Email Address: ");
            }
        } while (!gotEmail);

        System.out.println("What is your phone number? ");

        do {
            try {
                inputHandler.phoneNumber(passenger);
                if (passenger.getPhoneNumber().equals("")) {
                    throw new InputMismatchException();
                }
                else {
                    gotPhoneNumber = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter a valid Phone Number: ");
            }
        } while (!gotPhoneNumber);

        System.out.println("We offer discounts based on age and gender! What is your gender? ");

        do {
            try {
                inputHandler.gender(passenger);
                if (passenger.getGender().equals("")) {
                    throw new InputMismatchException();
                }
                else {
                    gotGender = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter your Gender: ");
            }
        } while (!gotGender);

        System.out.println("How old are you? ");

        do {
            try {
                inputHandler.age(passenger);
                if (passenger.getAge().equals("")) {
                    throw new InputMismatchException();
                }
                else {
                    gotAge = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter your Age: ");
            }
        } while (!gotAge);

        System.out.println("Thank you for providing us with your personal information. Does this look correct (y/n)?");
        System.out.println(passenger);

    }

    private static void flightDetails() throws IOException{

        System.out.println("Now for some information about your flight. ");
        System.out.println("Where are you leaving from? ");

        do {
            try {
                inputHandler.origin(flight);
                if (flight.getOrigin().equals("")) {
                    throw new InputMismatchException();
                }
                else {
                    gotOrigin = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter a Location: ");
            }
        } while (!gotOrigin);

        System.out.println("What is your destination? ");

        do {
            try {
                inputHandler.destination(flight);
                if (flight.getDestination().equals("")) {
                    throw new InputMismatchException();
                }
                else {
                    gotDestination = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter a Location: ");
            }
        } while (!gotDestination);

        System.out.println("What day would you like to leave? (mm/dd/yy) ");

        do {
            try {
                inputHandler.date(flight);
                if (flight.getDate().equals("")) {
                    throw new InputMismatchException();
                }
                else {
                    gotDate = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter a valid date (mm/dd/yy): ");
            }
        } while (!gotDate);

        System.out.println("At what time? (hh:mm) ");

        do {
            try {
                inputHandler.departure(flight);
                if (flight.getDeparture().equals("")) {
                    throw new InputMismatchException();
                }
                else {
                    gotDeparture = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter a valid time. (hh:mm): ");
            }
        } while (!gotDeparture);

    }


}
