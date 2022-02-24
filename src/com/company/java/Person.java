package com.company.java;

public class Person {

    // Fields
    private String name;
    private String email;
    private String phoneNumber;
    private String gender;
    private String age;

    // Default Constructor
    public Person() {

    }

    // Parameterized Constructor
    public Person(String n, String e, String pN, String g, String a) {

        this.name = n;
        this.email = e;
        this.phoneNumber = pN;
        this.gender = g;
        this.age = a;

    }

    // Accessors
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getGender(){
        return this.gender;
    }
    public String getAge(){
        return this.age;
    }

    // Mutators
    public void setName(String n){
        this.name = n;
    }
    public void setEmail(String e){
        this.email = e;
    }
    public void setPhoneNumber(String pN){
        this.phoneNumber = pN;
    }
    public void setGender(String g){
        this.gender = g;
    }
    public void setAge(String a){
        this.age = a;
    }

    // Printer
    @Override
    public String toString(){

        return "Passenger Name: " + getName() +
                " | Email Address: " + getEmail() + " |\nPhone Number: " + getPhoneNumber() +
                " | Gender: " + getGender() + " | Age: " + getAge();

    }

}
