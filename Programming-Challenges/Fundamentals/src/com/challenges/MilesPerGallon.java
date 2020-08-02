/*
A car’s miles-per-gallon (MPG) can be calculated with the following formula:
MPG = Miles driven / Gallons of gas used
Write a program that asks the user for the number of miles driven and the gallons of gas used.
It should calculate the car’s miles-per-gallon and display the result on the screen.
 */

package com.challenges;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        // Declare Variables
        double miles;
        double gallons;
        double milesPerGallon;

        System.out.println("Please enter the miles: ");
        miles = scanner.nextDouble();

        System.out.println("Please enter the gallons of gas used: ");
        gallons = scanner.nextDouble();

        milesPerGallon = miles / gallons;
        System.out.println("Miles Per Gallon: " + milesPerGallon);
    }
}
