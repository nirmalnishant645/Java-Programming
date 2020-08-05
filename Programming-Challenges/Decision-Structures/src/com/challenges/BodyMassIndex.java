/*
Write a program that calculates and displays a person’s body mass index (BMI).
The BMI is often used to determine whether a person with a sedentary lifestyle is overweight or underweight for his or her height.
A person’s BMI is calculated with the following formula:

BMI = Weight x 703 / Height (squared)

where weight is measured in pounds and height is measured in inches.

The program should display a message indicating whether the person has optimal weight, is underweight, or is overweight.
A sedentary person’s weight is considered optimal if his or her BMI is between 18.5 and 25.
If the BMI is less than 18.5, the person is considered underweight.
If the BMI value is greater than 25, the person is considered overweight.
 */

package com.challenges;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String [] args) {

        // Declare Variables
        double weight;
        double height;
        double BMI; // BMI = Weight x 703 / Height (squared)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your weight in pounds: ");
        weight = scanner.nextDouble();

        System.out.println("Please enter your height inches: ");
        height = scanner.nextDouble();

        BMI = weight * (703 / (height * height));

        if(BMI < 18.5) {
            System.out.println("You are underweight! Your BMI is " + BMI + ".");
        }
        else if(BMI > 25){
            System.out.println("You are overweight! Your BMI is " + BMI + ".");
        }
        else {
            System.out.println("Your weight is optimal for your height. Your BMI is " + BMI + ".");
        }
    }
}
