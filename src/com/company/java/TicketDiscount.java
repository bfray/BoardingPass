package com.company.java;

import static jdk.nashorn.internal.objects.NativeRegExp.ignoreCase;

public class TicketDiscount {//would have to extend an object to get ticket price
    public static double Discountedticket(double ticketPrice, Person person) {
        String gender = person.getGender();
        int age = Integer.parseInt(person.getAge());
        if(age < 13){
            ticketPrice = ticketPrice * 0.5;
        }
        else if(age > 59){
            ticketPrice = ticketPrice * 0.4;
        }
        else{
            if(gender.equals("F")){
                ticketPrice = ticketPrice *0.75;
            }
        }
        return ticketPrice;
    }
}
