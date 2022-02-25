package com.company.java;

public class Flight {
    private String boardingPassNumber;
    private String date;
    private String origin;
    private String originAirport;
    private String destination;
    private String destinationAirport;
    private String eta;
    private String departure;
    private String ticketPrice;
    private double latitudeX1;
    private double latitudeX2;
    private double longitudeX1;
    private double longitudeX2;
    private double distance;
    private static final double MEDIAN_FLIGHT_SPEED_MPH = 517.5;

    public String getBoardingPassNumber() {
        return boardingPassNumber;
    }

    public void setBoardingPassNumber(String boardingPassNumber) {
        this.boardingPassNumber = boardingPassNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(String ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(String originAirport) {
        this.originAirport = originAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public Flight(){

    }

    public Flight(String bpNum, String day, String from, String to, String eta, String leaving, String price){
        this.boardingPassNumber = bpNum;
        this.date = day;
        this.originAirport = from;
        this.destinationAirport = to;
        this.eta = eta;
        this.departure = leaving;
        this.ticketPrice = price;
    }

    @Override
    public String toString(){
        return "Boarding Pass Number: " + getBoardingPassNumber() +
                " | Date: " + getDate() + " |\nOrigin: " + getOriginAirport() + " | Departure: " + getDeparture() +
                " |\nDestination: " + getDestinationAirport() + " | ETA: " + getEta() + " |\nTicket Price: "
                + "$" + getTicketPrice() + "0";
    }

    // A method to determine the distance between two given airports
    public void calculateDistance(double latitudeX1, double latitudeX2,
                                  double longitudeX1, double longitudeX2) {

        // Convert to radians for polar calculations
        longitudeX1 = Math.toRadians(longitudeX1);
        longitudeX2 = Math.toRadians(longitudeX2);
        latitudeX1 = Math.toRadians(latitudeX1);
        latitudeX2 = Math.toRadians(latitudeX2);

        // Haversine formula
        double longitudeDifference = longitudeX2 - longitudeX1;
        double latitudeDifference = latitudeX2 - latitudeX1;
        double a = Math.pow(Math.sin(latitudeDifference / 2), 2)
                + Math.cos(latitudeX1) * Math.cos(latitudeX2)
                * Math.pow(Math.sin(longitudeDifference / 2),2);

        double c = 2 * Math.asin(Math.sqrt(a));

        // Radius of Earth in miles
        double r = 3958.8;

        // Result
        setDistance(c * r);
    }

    // Accessors and Mutators for Latitude and Longitude
    public double getLatitudeX1() {
        return this.latitudeX1;
    }
    public void setLatitudeX1(double x1) {
        this.latitudeX1 = x1;
    }
    public double getLatitudeX2() {
        return this.latitudeX2;
    }
    public void setLatitudeX2(double x2) {
        this.latitudeX2 = x2;
    }
    public double getLongitudeX1() {
        return this.longitudeX1;
    }
    public void setLongitudeX1(double x1) {
        this.longitudeX1 = x1;
    }
    public double getLongitudeX2() {
        return this.longitudeX2;
    }
    public void setLongitudeX2(double x2) {
        this.longitudeX2 = x2;
    }

    // Accessor and Mutator for distance
    public double getDistance() {
        return this.distance;
    }
    public void setDistance(double dist) {
        this.distance = dist;
    }

    // Method to extract coordinates from flight numbers
    public void setCoordinates() {

        String oLat;
        String oLon;
        String dLat;
        String dLon;
        String[] split1 = getOrigin().split(",");
        String[] split2 = getDestination().split(",");

        oLat = split1[0].substring(split1[0].indexOf("[") + 1);
        oLon = split1[1].substring(1, split1[1].indexOf("]"));
        dLat = split2[0].substring(split2[0].indexOf("[") + 1);
        dLon = split2[1].substring(1, split2[1].indexOf("]"));

        setLatitudeX1(Double.parseDouble(oLat));
        setLongitudeX1(Double.parseDouble(oLon));
        setLatitudeX2(Double.parseDouble(dLat));
        setLongitudeX2(Double.parseDouble(dLon));

    }

    // A Method to calculate the ETA
    public void calculateETA(Flight flight) {

        double decimalTime = flight.getDistance() / MEDIAN_FLIGHT_SPEED_MPH;
        double getDecimal = decimalTime % 1;
        int convertToMinutes = (int) (getDecimal * 60);
        int convertToHours = (int) (decimalTime);
        String hours;
        String minutes;
        int departureHour = Integer.parseInt(getDeparture().substring(0, 2));
        int departureMin = Integer.parseInt(getDeparture().substring(3, 5));
        String departureAP = getDeparture().substring(5);
        int magicHour;
        int magicMinute;

        if (departureAP.contains("PM")) {
            departureAP = "PM";
        }
        else if (departureAP.contains("AM")) {
            departureAP = "AM";
        }

        if (departureHour + convertToHours > 11) {

            if (departureHour + convertToHours > 11 && departureAP.contains("PM")) {
                departureAP = "AM";
            }
            else if (departureHour + convertToHours > 11 && departureAP.contains("AM")) {
                departureAP = "PM";
            }
            if (departureHour + convertToHours > 12) {
                magicHour = (departureHour + convertToHours) - 12;
            }
            else {
                magicHour = departureHour + convertToHours;
            }
        }
        else {
            magicHour = departureHour + convertToHours;
        }

        if (departureMin + convertToMinutes > 59) {

            if (magicHour + 1 == 12 && departureAP.contains("PM")) {
                departureAP = "AM";
            }
            else if (magicHour + 1 == 12 && departureAP.contains("AM")) {
                departureAP = "PM";
            }
            if (magicHour + 1 == 13) {
            magicHour = 1;
            }
            else {
                magicHour++;
            }

            magicMinute = (departureMin + convertToMinutes) - 60;
        }
        else {
            magicMinute = departureMin + convertToMinutes;
        }

        if (Integer.toString(magicHour).length() == 1) {
            hours = "0" + magicHour;
        }
        else {
            hours = Integer.toString(magicHour);
        }

        if (Integer.toString(magicMinute).length() == 1) {
            minutes = "0" + magicMinute;
        }
        else {
            minutes = Integer.toString(magicMinute);
        }

        setEta(hours + ":" + minutes + " " + departureAP);

    }



}
