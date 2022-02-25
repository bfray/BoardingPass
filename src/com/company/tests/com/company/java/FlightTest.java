package com.company.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {

    Flight flight;

    @BeforeEach
    void setUp(){
        flight = new Flight();
    }

    @Test
    void getBoardingPassNumber() {
        flight.setBoardingPassNumber("9G26I9");
        assertEquals("9G26I9", flight.getBoardingPassNumber(), "flight.getBoardingPassNumber malfunction");
    }

    @Test
    void setBoardingPassNumber() {
        flight.setBoardingPassNumber("9G26I9");
        assertEquals("9G26I9", flight.getBoardingPassNumber(), "flight.setBoardingPassNumber malfunction");
    }

    @Test
    void getDate() {
        flight.setDate("11/22/2022");
        assertEquals("11/22/2022", flight.getDate(), "flight.getDate malfunction");
    }

    @Test
    void setDate() {
        flight.setDate("11/22/2022");
        assertEquals("11/22/2022", flight.getDate(), "flight.setDate malfunction");
    }

    @Test
    void getOrigin() {
        flight.setOrigin("(Atlanta, GA) Hartsfield-Jackson International Airport, ATL~[33.6407, 84.4277]");
        assertEquals("(Atlanta, GA) Hartsfield-Jackson International Airport, ATL~[33.6407, 84.4277]", flight.getOrigin(), "flight.getOrigin malfunction");
    }

    @Test
    void setOrigin() {
        flight.setOrigin("(Atlanta, GA) Hartsfield-Jackson International Airport, ATL~[33.6407, 84.4277]");
        assertEquals("(Atlanta, GA) Hartsfield-Jackson International Airport, ATL~[33.6407, 84.4277]", flight.getOrigin(), "flight.setOrigin malfunction");
    }

    @Test
    void getDestination() {
        flight.setDestination("(Atlanta, GA) Hartsfield-Jackson International Airport, ATL~[33.6407, 84.4277]");
        assertEquals("(Atlanta, GA) Hartsfield-Jackson International Airport, ATL~[33.6407, 84.4277]", flight.getDestination(), "flight.getDestination malfunction");
    }

    @Test
    void setDestination() {
        flight.setOrigin("(Atlanta, GA) Hartsfield-Jackson International Airport, ATL~[33.6407, 84.4277]");
        assertEquals("(Atlanta, GA) Hartsfield-Jackson International Airport, ATL~[33.6407, 84.4277]", flight.getOrigin(), "flight.setDestination malfunction");
    }

    @Test
    void getEta() {
        flight.setEta("1 Hour 24 Minutes");
        assertEquals("1 Hour 24 Minutes", flight.getEta(), "flight.getEta() malfunction");
    }

    @Test
    void setEta() {
        flight.setEta("1 Hour 24 Minutes");
        assertEquals("1 Hour 24 Minutes", flight.getEta(), "flight.setEta() malfunction");
    }

    @Test
    void getDeparture() {
        flight.setDeparture("11:00");
        assertEquals("11:00", flight.getDeparture(), "flight.getDeparture() malfunction");
    }

    @Test
    void setDeparture() {
        flight.setDeparture("11:00");
        assertEquals("11:00", flight.getDeparture(), "flight.setDeparture() malfunction");
    }

    @Test
    void getTicketPrice() {
        flight.setTicketPrice("300.0");
        assertEquals("300.0", flight.getTicketPrice(), "flight.getTicketPrice() malfunction");
    }

    @Test
    void setTicketPrice() {
        flight.setTicketPrice("300.0");
        assertEquals("300.0", flight.getTicketPrice(), "flight.setTicketPrice() malfunction");
    }

    @Test
    void getOriginAirport() {
        flight.setOriginAirport("(San Francisco, CA) San Francisco International Airport, SFO");
        assertEquals("(San Francisco, CA) San Francisco International Airport, SFO", flight.getOriginAirport(), "flight.getOriginAirport() malfunction");
    }

    @Test
    void setOriginAirport() {
        flight.setOriginAirport("(San Francisco, CA) San Francisco International Airport, SFO");
        assertEquals("(San Francisco, CA) San Francisco International Airport, SFO", flight.getOriginAirport(), "flight.setOriginAirport() malfunction");
    }

    @Test
    void getDestinationAirport() {
        flight.setDestinationAirport("(San Francisco, CA) San Francisco International Airport, SFO");
        assertEquals("(San Francisco, CA) San Francisco International Airport, SFO", flight.getDestinationAirport(), "flight.getDestinationAirport() malfunction");
    }

    @Test
    void setDestinationAirport() {
        flight.setDestinationAirport("(San Francisco, CA) San Francisco International Airport, SFO");
        assertEquals("(San Francisco, CA) San Francisco International Airport, SFO", flight.getDestinationAirport(), "flight.getOriginAirport() malfunction");
    }


    @Test
    void calculateDistance() {

        double d1 = 33.6407;
        double d2 = 32.8998;
        double d3 = 84.4277;
        double d4 = 97.0403;

        flight.calculateDistance(d1, d2, d3, d4);

        assertEquals(729.9592539129452, flight.getDistance(), "flight.calculateDistance() malfunction");

    }

    @Test
    void getLatitudeX1() {
        flight.setLatitudeX1(33.6407d);
        assertEquals(33.6407d, flight.getLatitudeX1(), "flight.getLatitudeX1 malfunction");
    }

    @Test
    void setLatitudeX1() {
        flight.setLatitudeX1(33.6407d);
        assertEquals(33.6407d, flight.getLatitudeX1(), "flight.setLatitudeX1 malfunction");
    }

    @Test
    void getLatitudeX2() {
        flight.setLatitudeX2(33.6407d);
        assertEquals(33.6407d, flight.getLatitudeX2(), "flight.getLatitudeX2 malfunction");
    }

    @Test
    void setLatitudeX2() {
        flight.setLatitudeX2(33.6407d);
        assertEquals(33.6407d, flight.getLatitudeX2(), "flight.setLatitudeX2 malfunction");
    }

    @Test
    void getLongitudeX1() {
        flight.setLongitudeX1(33.6407d);
        assertEquals(33.6407d, flight.getLongitudeX1(), "flight.getLongitudeX1 malfunction");
    }

    @Test
    void setLongitudeX1() {
        flight.setLongitudeX1(33.6407d);
        assertEquals(33.6407d, flight.getLongitudeX1(), "flight.setLongitudeX1 malfunction");
    }

    @Test
    void getLongitudeX2() {
        flight.setLongitudeX2(33.6407d);
        assertEquals(33.6407d, flight.getLongitudeX2(), "flight.getLongitudeX2 malfunction");
    }

    @Test
    void setLongitudeX2() {
        flight.setLongitudeX2(33.6407d);
        assertEquals(33.6407d, flight.getLongitudeX2(), "flight.setLongitudeX2 malfunction");
    }

    @Test
    void getDistance() {
        flight.setDistance(729.9592539129452);
        assertEquals(729.9592539129452, flight.getDistance(), "flight.getDistance malfunction");
    }

    @Test
    void setDistance() {
        flight.setDistance(729.9592539129452);
        assertEquals(729.9592539129452, flight.getDistance(), "flight.setDistance malfunction");
    }

    @Test
    void setCoordinates() {
        String oLat = "33.6407";
        String oLon = "84.4277";
        String dLat = "32.8998";
        String dLon = "97.0403";

        flight.setLatitudeX1(Double.parseDouble(oLat));
        flight.setLongitudeX1(Double.parseDouble(oLon));
        flight.setLatitudeX2(Double.parseDouble(dLat));
        flight.setLongitudeX2(Double.parseDouble(dLon));


        assertEquals(33.6407d, flight.getLatitudeX1(), "flight.setLatitudeX1 malfunction");
        assertEquals(84.4277d, flight.getLongitudeX1(), "flight.setLongitudeX1 malfunction");
        assertEquals(32.8998d, flight.getLatitudeX2(), "flight.setLongitudeX1 malfunction");
        assertEquals(97.0403d, flight.getLongitudeX2(), "flight.setLongitudeX2 malfunction");

    }

    @Test
    void calculateETA() {

        flight.setDistance(729.9592539129452);
        flight.setDeparture("11:00 AM");
        flight.calculateETA(flight);

        assertEquals("12:24 PM", flight.getEta(), "flight.calculateETA() error");

    }
}