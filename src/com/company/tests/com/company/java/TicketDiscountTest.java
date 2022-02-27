package com.company.java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TicketDiscountTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void discountedticket() {
        Flight flight = new Flight();
        Person person = new Person();
        TicketDiscount ticketDiscount = new TicketDiscount();

        double ticketPrice = 200;

        flight.setDistance(729.9592539129452d);
        person.setAge("60");
        person.setGender("M");


        try {
            inputHandler.ticketPrice(flight, person);
        }catch(IOException e){
            System.err.println("IOException:   " + e);
        }

        TicketDiscount.Discountedticket(ticketPrice, person);


        assertEquals("40.0", flight.getTicketPrice(), "Error: inputHandler.ticketPrice()");
    }

    @Test
    void discountedticket2() {
        Flight flight = new Flight();
        Person person = new Person();
        TicketDiscount ticketDiscount = new TicketDiscount();

        double ticketPrice = 200;

        flight.setDistance(729.9592539129452d);
        person.setAge("3");
        person.setGender("M");


        try {
            inputHandler.ticketPrice(flight, person);
        }catch(IOException e){
            System.err.println("IOException:   " + e);
        }

        TicketDiscount.Discountedticket(ticketPrice, person);


        assertEquals("50.0", flight.getTicketPrice(), "Error: inputHandler.ticketPrice()");
    }

    @Test
    void discountedticket3() {
        Flight flight = new Flight();
        Person person = new Person();
        TicketDiscount ticketDiscount = new TicketDiscount();

        double ticketPrice = 200;

        flight.setDistance(729.9592539129452d);
        person.setAge("30");
        person.setGender("F");


        try {
            inputHandler.ticketPrice(flight, person);
        }catch(IOException e){
            System.err.println("IOException:   " + e);
        }

        TicketDiscount.Discountedticket(ticketPrice, person);


        assertEquals("75.0", flight.getTicketPrice(), "Error: inputHandler.ticketPrice()");
    }
}