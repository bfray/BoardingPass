package com.company.java;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BoardingPass {

    static Person passenger = new Person();
    static Flight flightPass = new Flight();

    public BoardingPass() {

    }
    public BoardingPass(Person person, Flight flight) throws IOException {

        passenger = person;
        flightPass = flight;

        Charset utf8 = StandardCharsets.UTF_8;

        Files.write(Paths.get("src/com/company/resources/" + person.getName() + "_Boarding Pass.txt"),
                (passenger.toString() + " |\n" + flightPass.toString()).getBytes(utf8));
    }

    @Override
    public String toString() {

        return passenger.toString() + " |\n" + flightPass.toString();
    }

}
