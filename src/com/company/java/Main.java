package com.company.java;

import java.io.IOException;
import java.util.InputMismatchException;

public class Main {

    static Person passenger = new Person();
    static Flight flight = new Flight();
    static boolean gotName = false;
    static boolean gotEmail = false;
    static boolean gotPhoneNumber = false;
    static boolean gotGender = false;
    static boolean gotAge = false;

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to the Flight Purchase Station!");
        System.out.println("Let's get some information about you before we begin.");
        personalInfo();

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
}
