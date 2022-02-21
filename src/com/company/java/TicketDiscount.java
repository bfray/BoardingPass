package com.company.java;

import static jdk.nashorn.internal.objects.NativeRegExp.ignoreCase;

public class TicketDiscount {//would have to extend an object to get ticket price
    public double Discountedticket(double ticketPrice, Person person) {
        String gender = person.getGender();
        Integer age = Integer.parseInt(person.getAge());
        if(age <= 12){
            ticketPrice = ticketPrice * 0.5;
        }
        else if(age >= 60){
            ticketPrice = ticketPrice * 0.4;
        }
        if(gender == ignoreCase("Female")){
            ticketPrice = ticketPrice *0.75;
        }
        return ticketPrice;
    }
}
