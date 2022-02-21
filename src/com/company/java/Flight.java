package com.company.java;

public class Flight {
    private String boardingPassNumber;
    private String date;
    private String origin;
    private String destination;
    private String eta;

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

    public Flight(){

    }
    public Flight(String bpNum, String day, String from, String to, String eta){
        this.boardingPassNumber = bpNum;
        this.date = day;
        this.origin = from;
        this.destination = to;
        this.eta = eta;
    }

    @Override
    public String toString(){
        return "Boarding Pass Number: " + getBoardingPassNumber() +
                " | Date: " + getDate() + " | Origin: " + getOrigin() +
                " | Destination: " + getDestination() + " | ETA: " + getEta();
    }
}
