package com.company.java;

import static jdk.nashorn.internal.objects.NativeRegExp.ignoreCase;

public class TicketDiscount {//would have to extend an object to get ticket price
    public double Discountedticket(Flight flight, Person person) {
        double ticketPrice = Double.parseDouble(flight.getTicketPrice());
        String gender = person.getGender();
        int age = Integer.parseInt(person.getAge());
        if(age <= 12){
            ticketPrice = ticketPrice * 0.5;
        }
        else if(age >= 60){
            ticketPrice = ticketPrice * 0.4;
        }
        else{
            if(gender == ignoreCase("Female")){
                ticketPrice = ticketPrice *0.75;
            }
        }
        return ticketPrice;
    }
}
