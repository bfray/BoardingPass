package com.company.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class inputHandler {

    public ArrayList<String> airports() throws IOException {

        ArrayList<String> serviceLocations = Files.readAllLines(Paths.get("D:\\GenSpark\\Boarding Pass" +
                "\\src\\Resources\\airportsInService"))
                .stream().collect(Collectors.toCollection(ArrayList::new));

        return null;
    }

}
