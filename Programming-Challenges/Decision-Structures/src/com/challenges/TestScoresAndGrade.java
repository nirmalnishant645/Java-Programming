/*
Write a program that has variables to hold three test scores.
The program should ask the user to enter three test scores and then assign the values entered to the variables.
The program should display the average of the test scores and the letter grade that is assigned for the test score average.
Use the grading scheme in the following table:

    Test Score Average      Letter Grade
         90–100                 A
         80–89                  B
         70–79                  C
         60–69                  D
         Below 60               F
 */

package com.challenges;

import java.util.Scanner;

public class TestScoresAndGrade {
    public static void main(String [] args) {

        // Declare Variables
        double scoreOne;
        double scoreTwo;
        double scoreThree;
        double avg;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first test score: ");
        scoreOne = scanner.nextDouble();

        System.out.println("Enter the second test score: ");
        scoreTwo = scanner.nextDouble();

        System.out.println("Enter the third test score: ");
        scoreThree = scanner.nextDouble();

        avg = (scoreOne + scoreTwo + scoreThree) / 3;

        if(avg < 60) {
            System.out.printf("The average is %.0f. The grade is F.", avg);
        }
        else if(avg < 70) {
            System.out.printf("The average is %.0f. The grade is D.", avg);
        }
        else if(avg < 80) {
            System.out.printf("The average is %.0f. The grade is C", avg);
        }
        else if(avg < 90) {
            System.out.printf("The average is %.0f. The grade is B.", avg);
        }
        else if(avg <= 100) {
            System.out.printf("The average is %.0f. The grade is A.", avg);
        }
        else {
            System.out.println("Something went wrong! Invalid Average.");
        }
    }
}
