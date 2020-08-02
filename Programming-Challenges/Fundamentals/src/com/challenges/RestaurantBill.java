/*
Write a program that computes the tax and tip on a restaurant bill.
The program should ask the user to enter the charge for the meal.
The tax should be 6.75 percent of the meal charge.
The tip should be 20 percent of the total after adding the tax.
Display the meal charge, tax amount, tip amount, and total bill on the screen.
 */

package com.challenges;

import java.util.Scanner;

public class RestaurantBill {
    public static void main(String [] main) {

        // Declare Variable
        double mealCharge;
        final double TAX_PERCENTAGE = 0.0675;
        final double TIP_PERCENTAGE = 0.20;
        double totalTax;
        double totalTip;
        double totalBill;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the cost of the meal: ");
        mealCharge = scanner.nextDouble();

        totalTax = mealCharge * TAX_PERCENTAGE;
        totalTip = (mealCharge + totalTax) * TIP_PERCENTAGE;
        totalBill = mealCharge + totalTax + totalTip;

        System.out.println("Charge for the meal: $" + mealCharge);
        System.out.println("Total Tax on the meal: $" + totalTax);
        System.out.println("Total Tip on the meal: $" + totalTip);
        System.out.println("Total Bill: $" + totalBill);
    }
}
