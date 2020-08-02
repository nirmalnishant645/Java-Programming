/*
Write a program that asks the user to enter the name of his or her favorite city.
Use a String variable to store the input. The program should display the following:

•  The number of characters in the city name
•  The name of the city in all uppercase letters
•  The name of the city in all lowercase letters
•  The first character in the name of the city

 */

package com.challenges;

import java.util.Scanner;

public class StringManipulator {
    public static void main(String [] args) {

        // Declare variable
        String city;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the name of your favourite city: ");
        city = scanner.nextLine();

        System.out.println("The number of characters in the city: " + city.length());
        System.out.println("The name of the city in all uppercase letters: " + city.toUpperCase());
        System.out.println("The name of the city in all lowercase letters: " + city.toLowerCase());
        System.out.println("The first character in the name of the city: " + city.charAt(0));
    }
}
