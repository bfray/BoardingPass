package com.company.java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class BoardingPassTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToString() throws IOException {

        Person person = new Person();
        Flight flight = new Flight();
        person = new Person("John Doe", "John@doe.net", "1234567890",
                "M", "30");
        flight = new Flight("Q1Z7T6", "01/01/23", "CandyLand",
                "Valhalla", "Infinity", "Negative Infinity", "78,000,000,000,000.1");
        BoardingPass johnsEternalPass = new BoardingPass();
        johnsEternalPass = new BoardingPass(person, flight);

        assertEquals("Passenger Name: " +
                person.getName() +
                " | " + "Email Address: " +
                person.getEmail() +
                " |\n" + "Phone Number: " +
                person.getPhoneNumber() +
                " | " + "Gender: " +
                person.getGender() +
                " | " + "Age: " +
                person.getAge() +
                " |\n" + "Boarding Pass Number: " +
                flight.getBoardingPassNumber() +
                " | " + "Date: " +
                flight.getDate() +
                " |\n" + "Origin: " +
                flight.getOriginAirport() +
                " | " + "Departure: " +
                flight.getDeparture() +
                " |\n" + "Destination: " +
                flight.getDestinationAirport() +
                " | " + "ETA: " +
                flight.getEta() +
                " |\n" + "Ticket Price: $" +
                flight.getTicketPrice() + "0"
                , johnsEternalPass.toString(), "The Boarding Pass object is not functioning properly");

    }
}