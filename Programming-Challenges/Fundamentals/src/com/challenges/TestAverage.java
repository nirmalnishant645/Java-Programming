/*
Write a program that asks the user to enter three test scores.
The program should display each test score, as well as the average of the scores.
 */

package com.challenges;

import java.util.Scanner;

public class TestAverage {
    public static void main(String [] args) {

        // Declare Variables

        double firstScore;
        double secondScore;
        double thirdScore;
        double avg;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first score: ");
        firstScore = scanner.nextDouble();

        System.out.println("Please enter the second score: ");
        secondScore = scanner.nextDouble();

        System.out.println("Please enter the third score: ");
        thirdScore = scanner.nextDouble();

        avg = (firstScore + secondScore + thirdScore) / 3;

        System.out.println("The average of " + firstScore + ", " + secondScore + ", " + thirdScore + " = " + avg);
    }
}
