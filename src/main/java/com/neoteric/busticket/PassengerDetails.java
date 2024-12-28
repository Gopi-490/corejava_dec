package com.neoteric.busticket;

import java.util.List;

public class PassengerDetails {
    public String firstName;
    public String lastName;
    public double phoneNumber;
    public String gender;
    public int age;
    public int noOfpassenger;
    public List<PassengerDetails> PassengerDetailsList;

    @Override
    public String toString() {
        return "PassengerDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", noOfpassenger=" + noOfpassenger +
                ", PassengerDetailsList=" + PassengerDetailsList +
                '}';
    }
}
