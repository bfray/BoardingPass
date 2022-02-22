package com.company.java;

public class Flight {
    private String boardingPassNumber;
    private String date;
    private String origin;
    private String destination;
    private String eta;
    private String departure;
    private String ticketPrice;

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

    public Flight(){

    }
    public Flight(String bpNum, String day, String from, String to, String eta, String leaving, String price){
        this.boardingPassNumber = bpNum;
        this.date = day;
        this.origin = from;
        this.destination = to;
        this.eta = eta;
        this.departure = leaving;
        this.ticketPrice = price;
    }

    @Override
    public String toString(){
        return "Boarding Pass Number: " + getBoardingPassNumber() +
                " | Date: " + getDate() + " | Origin: " + getOrigin() + " | Departure: " + getDeparture() +
                " | Destination: " + getDestination() + " | ETA: " + getEta() + " | Ticket Price: " + getTicketPrice();
    }

    public static double calculateDistance(double latitudeX1, double latitudeX2,
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
        return(c * r);
    }

}
