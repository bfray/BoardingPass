package com.company.java;

import javax.xml.stream.Location;
import java.util.Date;

public class Flight {
    private int boardingPassNumber;
    private Date date;
    private Location origin;
    private Location destination;
    private String eta;

    public int getBoardingPassNumber() {
        return boardingPassNumber;
    }

    public void setBoardingPassNumber(int boardingPassNumber) {
        this.boardingPassNumber = boardingPassNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Location getOrigin() {
        return origin;
    }

    public void setOrigin(Location origin) {
        this.origin = origin;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
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
    public Flight(int bpNum, Date day, Location from, Location to, String eta){
        this.boardingPassNumber = bpNum;
        this.date = day;
        this.origin = from;
        this.destination = to;
        this.eta = eta;
    }

    @Override
    public String toString(){
        return null;
    }
}
