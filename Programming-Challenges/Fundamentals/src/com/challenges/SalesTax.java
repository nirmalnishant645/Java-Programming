/*
Write a program that will ask the user to enter the amount of a purchase.
The program should then compute the state and county sales tax.
Assume the state sales tax is 4 percent and the county sales tax is 2 percent.
The program should display the amount of the purchase, the state sales tax, the county sales tax, the total sales tax,
and the total of the sale (which is the sum of the amount of purchase plus the total sales tax).

Hint: Use the value 0.02 to represent 2 percent, and 0.04 to represent 4 percent.
 */

package com.challenges;

import java.util.Scanner; // Import the Scanner Class

public class SalesTax {
    public static void main(String [] args) {

        // Declare Variables
        final double STATE_TAX = 0.04;
        final double COUNTY_TAX = 0.02;
        double purchaseAmount;
        double countyTax;
        double stateTax;
        double totalTax;
        double totalSale;

        Scanner scanner = new Scanner(System.in); // Creating Scanner Object

        System.out.print("Please enter the purchase amount: ");
        purchaseAmount = scanner.nextDouble(); // Taking Purchase Amount as Input

        countyTax = COUNTY_TAX * purchaseAmount; // Calculating Country Tax
        stateTax = STATE_TAX * purchaseAmount; // Calculating State Tax

        totalTax = countyTax + stateTax; // Calculating Total Tax

        totalSale = purchaseAmount + totalTax; // Calculating Total Sale Amount

        System.out.println("Amount of purchase: $" + purchaseAmount);
        System.out.println("State Sales Tax: $" + stateTax);
        System.out.println("County Sales Tax: $" + countyTax);
        System.out.println("Total Sales Tax: $" + totalTax);
        System.out.println("Total Sale: $" + totalSale);

    }
}