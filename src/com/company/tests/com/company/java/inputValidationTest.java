package com.company.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class inputValidationTest {


    @Test
    void checkName() {
        Person person = new Person();
        person.setName("Java");
        assertTrue(inputValidation.checkName(person.getName()), "Error: inputValidation.checkName");
    }

    @Test
    void checkEmail() {
        Person person = new Person();
        person.setEmail("java@java.com");
        assertTrue(inputValidation.checkEmail(person.getEmail()), "Error: inputValidation.checkEmail");
    }

    @Test
    void checkGender() {
        Person person = new Person();
        person.setGender("M");
        assertTrue(inputValidation.checkGender(person.getGender()), "Error: inputValidation.checkGender");
    }

    @Test
    void checkAge() {
        Person person = new Person();
        person.setAge("20");
        assertTrue(inputValidation.checkAge(person.getAge()), "Error: inputValidation.checkAge");
    }

    @Test
    void checkNumber() {
        Person person = new Person();
        person.setPhoneNumber("1234567890");
        assertTrue(inputValidation.checkNumber(person.getPhoneNumber()), "Error: inputValidation.checkNumber");
    }

    @Test
    void checkDate() {
        Flight flight = new Flight();
        flight.setDate("11/22/22");
        assertTrue(inputValidation.checkDate(flight.getDate()), "Error: inputValidation.checkDate");
    }

    @Test
    void checkDeparture() {
        Flight flight = new Flight();
        flight.setDeparture("11:00 AM");
        assertTrue(inputValidation.checkDeparture(flight.getDeparture()), "Error: inputValidation.checkDeparture");
    }
}