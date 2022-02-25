package com.company.java;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;


class inputHandlerTest {


    @Test
    void name() {
        Person person = new Person();
        person.setName("Java");
        assertEquals("Java", person.getName(), "Input Handler: name() error");
    }

    @Test
    void email() {
        Person person = new Person();
        person.setEmail("test@gmail.com");
        assertEquals("test@gmail.com", person.getEmail(), "Input Handler: email() error");
    }

    @Test
    void phoneNumber() {
        Person person = new Person();
        person.setPhoneNumber("1234567891");
        assertEquals("1234567891", person.getPhoneNumber(), "Input Handler: phoneNumber() error");
    }

    @Test
    void gender() {
        Person person = new Person();
        person.setGender("O");
        assertEquals("O", person.getGender(), "Input Handler: gender() error");
    }

    @Test
    void age() {
        Person person = new Person();
        person.setAge("30");
        assertEquals("30", person.getAge(), "Input Handler: age() error");
    }

    @Test
    void boardingPassNumberLength() {
       Flight flight = new Flight();
       inputHandler.boardingPassNumber(flight);
       String random = flight.getBoardingPassNumber();
       // this is incorrect, need to refactor
       assertEquals(6, random.length(), "Error: inputHandler.boardinPassNumberLength()");
    }

    @Test
    void boardingPassNumberCharacter(){
        Flight flight = new Flight();
        inputHandler.boardingPassNumber(flight);
        String random = flight.getBoardingPassNumber();
        String charsTest = "^[A-Z0-9]*$";
        assertTrue(random.matches(charsTest), "Failed at checking given characters, meaning string has invalid characters");
    }


    @Test
    void origin() {
        Flight flight = new Flight();
        inputHandler inputHandler = new inputHandler();
        String airport = com.company.java.inputHandler.airportList.get(1);
        flight.setOriginAirport(airport);

        assertEquals("(Dallas - Ft. Worth, TX) Dallas/Fort Worth International Airport, DFW", flight.getOriginAirport(), "Error: inputHandler.origin()");

    }

    @Test
    void destination() {
        Flight flight = new Flight();
        inputHandler inputHandler = new inputHandler();
        String airport = com.company.java.inputHandler.airportList.get(1);
        flight.setDestinationAirport(airport);

        assertEquals("(Dallas - Ft. Worth, TX) Dallas/Fort Worth International Airport, DFW", flight.getDestinationAirport(), "Error: inputHandler.origin()");
    }

    @Test
    void ticketPrice() {
        Flight flight = new Flight();
        Person person = new Person();
        inputHandler inputHandler = new inputHandler();

        flight.setDistance(729.9592539129452d);
        person.setAge("20");
        person.setGender("M");

        try{
            com.company.java.inputHandler.ticketPrice(flight, person);
        }catch(IOException e){
            System.err.print("IO exception");
        }

        assertEquals("100.0", flight.getTicketPrice(), "Error: inputHandler.ticketPrice()");

    }
}