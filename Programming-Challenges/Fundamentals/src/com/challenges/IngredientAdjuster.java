/*
A cookie recipe calls for the following ingredients:
•  1.5 cups of sugar
•  1 cup of butter
•  2.75 cups of flour
The recipe produces 48 cookies with these amounts of the ingredients.
Write a program that asks the user how many cookies he or she wants to make,
and then displays the number of cups of each ingredient needed for the specified number of cookies.
 */

package com.challenges;

import java.util.Scanner;

public class IngredientAdjuster {
    public static void main(String [] args) {

        // Declare Variables
        final int NO_OF_COOKIES = 48;
        final double CUPS_OF_SUGAR = 1.5;
        final double CUPS_OF_BUTTER = 1;
        final double CUPS_OF_FLOUR = 2.75;
        int noOfCookiesToMake;
        double cupsOfSugar;
        double cupsOfButter;
        double cupsOfFlour;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of cookies to be made: ");
        noOfCookiesToMake = scanner.nextInt();

        cupsOfSugar = ((float)CUPS_OF_SUGAR / NO_OF_COOKIES) * noOfCookiesToMake;
        cupsOfButter = ((float)CUPS_OF_BUTTER / NO_OF_COOKIES) * noOfCookiesToMake;
        cupsOfFlour = ((float) CUPS_OF_FLOUR / NO_OF_COOKIES) * noOfCookiesToMake;

        System.out.println("To make " + noOfCookiesToMake + " cookies,");
        System.out.println("Cups of Sugar: " + cupsOfSugar);
        System.out.println("Cups of Butter: " + cupsOfButter);
        System.out.println("Cups of Flour: " + cupsOfFlour);
    }
}
