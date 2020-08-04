/*
Write a program that prompts the user to enter a number within the range of 1 through 10.
The program should display the Roman numeral version of that number.
If the number is outside the range of 1 through 10, the program should display an error message.
 */

package com.challenges;

import java.util.Scanner;

public class RomanNumerals {
    public static void main(String [] args) {

        // Declare Variables
        int userInput;

        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        //Prompt user for input
        System.out.println("Please enter a number from 1 to 10: ");
        userInput = scanner.nextInt();

        // Check for range
        if(userInput < 1 || userInput > 10) {
            System.out.println("ERROR! Number out of range.");
        }
        else {
            System.out.print(userInput + " in Roman Numeral is, ");
            if(userInput == 1) {
                System.out.println("I");
            }
            else if(userInput == 2) {
                System.out.println("II");
            }
            else if(userInput == 3) {
                System.out.println("III");
            }
            else if(userInput == 4) {
                System.out.println("IV");
            }
            else if(userInput == 5) {
                System.out.println("V");
            }
            else if(userInput == 6) {
                System.out.println("VI");
            }
            else if(userInput == 7) {
                System.out.println("VII");
            }
            else if(userInput == 8) {
                System.out.println("VIII");
            }
            else if(userInput == 9) {
                System.out.println("IX");
            }
            else {
                System.out.println("X");
            }
        }
    }
}
