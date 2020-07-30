package com.challenges;

/*
Write a program that has the following String variables: firstName, middleName, and lastName.
Initialize these with your first, middle, and last names.
The program should also have the following char variables: firstInitial, middleInitial, and lastInitial.
Store your first, middle, and last initials in these variables.
The program should display the contents of these variables on the screen.
 */

public class NameAndInitials {
    public static void main(String [] args) {

        // Declare Variables
        String firstName = "Nishant";
        String middleName = " ";
        String lastName = "Nirmal";

        char firstInitial = 'N';
        char middleInitial = ' ';
        char lastInitial = 'N';

        System.out.println("Full Name: " + firstName + middleName + lastName);
        System.out.println("Initials: " + firstInitial + "." + middleInitial + lastInitial);

    }
}