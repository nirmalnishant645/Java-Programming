package com.challenges;

/*
Write a program that displays the following information, each on a separate line:
•  Your name
•  Your address, with city, state, and ZIP
•  Your telephone number
•  Your college major
Although these items should be displayed on separate output lines,
use only a single println statement in your program.
 */

public class PersonalInformation {
    public static void main(String [] args) {

        //Declare Variables

        String name = "Nishant Nirmal";
        String street = "Model Colony";
        String city = "Pune";
        String state = "Maharashtra";
        String zip = "410016";
        String telephone = "8734920289";
        String collegeMajor = "Computer Science";

        System.out.println(name + "\n" + street + ", " + city + ", " + state + " - " + zip + "\n" + telephone + "\n" + collegeMajor);
    }
}