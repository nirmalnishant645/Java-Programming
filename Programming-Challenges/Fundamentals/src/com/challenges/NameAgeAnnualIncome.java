package com.challenges;

/*
Write a program that declares the following:
    •  a String variable named name
    •  an int variable named age
    •  a double variable named annualPay
Store your age, name, and desired annual income as literals in these variables. The program should display these values on the screen in a manner
similar to the following:

My name is Joe Mahoney, my age is 26 and
I hope to earn $100000.0 per year.
 */

public class NameAgeAnnualIncome {

    public static void main(String [] args) {

        // Declare Variables
        String name = "Joe Mahoney";
        int age = 26;
        double annualPay = 100000.0;

        // Print out details
        System.out.print("My name is " + name + ", my age is " + age + " and\nI hope to earn $" + annualPay + " per year.");

    }
}