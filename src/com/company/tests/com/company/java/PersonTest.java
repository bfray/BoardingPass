package com.company.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person person = new Person();
        person.setName("Java");

        assertEquals("Java", person.getName(), "Error: person.getName()");
    }

    @Test
    void getEmail() {
        Person person = new Person();
        person.setEmail("java@oracle.com");

        assertEquals("java@oracle.com", person.getEmail(), "Error: person.getEmail()");
    }

    @Test
    void getPhoneNumber() {
        Person person = new Person();
        person.setPhoneNumber("1234567901");

        assertEquals("1234567901", person.getPhoneNumber(), "Error: person.getPhoneNumber()");

    }

    @Test
    void getGender() {
        Person person = new Person();
        person.setGender("O");

        assertEquals("O", person.getGender(), "Error: person.getGender()");

    }

    @Test
    void getAge() {
        Person person = new Person();
        person.setAge("30");

        assertEquals("30", person.getAge(), "Error: person.getAge()");

    }

    @Test
    void setName() {
        Person person = new Person();
        person.setName("java");

        assertEquals("java", person.getName(), "Error: person.setName()");

    }

    @Test
    void setEmail() {
        Person person = new Person();
        person.setEmail("java@oracle.com");

        assertEquals("java@oracle.com", person.getEmail(), "Error: person.getEmail()");

    }

    @Test
    void setPhoneNumber() {
        Person person = new Person();
        person.setPhoneNumber("1234567901");

        assertEquals("1234567901", person.getPhoneNumber(), "Error: person.setPhoneNumber()");

    }

    @Test
    void setGender() {
        Person person = new Person();
        person.setGender("O");

        assertEquals("O", person.getGender(), "Error: person.setGender()");

    }

    @Test
    void setAge() {
        Person person = new Person();
        person.setAge("30");

        assertEquals("30", person.getAge(), "Error: person.getAge()");

    }

    @Test
    void testToString() {
        Person person = new Person("java", "java@oracle.com", "1234567891", "O", "30");
        assertEquals("Passenger Name: " + "java" +
                " | Email Address: " + "java@oracle.com" + " |\nPhone Number: " + "1234567891" +
                " | Gender: " + "O" + " | Age: " + "30", "Passenger Name: " + person.getName() +
                " | Email Address: " + person.getEmail() + " |\nPhone Number: " + person.getPhoneNumber() +
                " | Gender: " + person.getGender() + " | Age: " + person.getAge(), "Error: person.toString()" );
    }
}