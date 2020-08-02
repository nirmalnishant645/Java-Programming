/*
Write a program that asks the user for the number of males and the number of females registered in a class.
The program should display the percentage of males and females in the class.
Hint: Suppose there are 8 males and 12 females in a class.
There are 20 students in the class.
The percentage of males can be calculated as 8 / 20 = 0.4, or 40%.
The percentage of females can be calculated as 12 / 20 5 = 0.6, or 60%.
 */

package com.challenges;

import java.util.Scanner;

public class MaleAndFemalePercentages {
    public static void main(String [] args) {

        // Declare Variables
        int maleStudents;
        int femaleStudents;
        int totalStudents;
        double malePercentage;
        double femalePercentage;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of male students in the class: ");
        maleStudents = scanner.nextInt();
        System.out.println("Enter the number of female students in the class: ");
        femaleStudents = scanner.nextInt();

        totalStudents = maleStudents + femaleStudents;

        malePercentage = ((float)maleStudents / totalStudents) * 100;
        femalePercentage =  ((float)femaleStudents / totalStudents) * 100;

        System.out.println("The percentage of male students in the class: " + malePercentage + "%");
        System.out.println("The percentage of female students in the class: " + femalePercentage + "%");
    }
}
