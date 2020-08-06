/*
Scientists measure an object’s mass in kilograms and its weight in Newtons.
If you know the amount of mass that an object has, you can calculate its weight, in Newtons, with the following formula:

Weight = Mass x 9.8

Write a program that asks the user to enter an object’s mass, and then calculate its weight.
If the object weighs more than 1,000 Newtons, display a message indicating that it is too heavy.
If the object weighs less than 10 Newtons, display a message indicating that the object is too light.
*/

package com.challenges;

import java.util.Scanner;

public class MassAndWeight {
    public static void main(String [] args) {

        // Declare Variables
        double weight;
        double mass;
        final double GRAVITY_CONSTANT = 9.8;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter mass of an object: ");
        mass =  scanner.nextDouble();

        weight = mass * GRAVITY_CONSTANT;

        if(weight > 1000) {
            System.out.printf("The weight of the object is %.1f Newtons. The object is too heavy!", weight);
        }
        else if(weight < 10) {
            System.out.printf("The weight of the object is %.1f Newtons. The object is too light!", weight);
        }
        else {
            System.out.printf("The weight of the object is %.1f", weight);
        }
    }
}
