/*
The East Coast sales division of a company generates 62 percent of total sales.
Based on that percentage, write a program that will predict how much the East Coast division will generate if the company has $4.6 million in sales this year.
Hint: Use the value 0.62 to represent 62 percent.
 */

package com.challenges;

public class SalesPrediction {
    public static void main(String [] args) {

        // Declare Variables
        double totalSales = 4600000;

        // Output
        System.out.println("The East Coast sales division will make 62% of $4.6 Million: " + (0.62 * totalSales));
    }
}