/*
An electronics company sells circuit boards at a 40 percent profit.
If you know the retail price of a circuit board, you can calculate its profit with the following formula:
Profit = Retail price × 0.4
Write a program that asks the user for the retail price of a circuit board,
calculates the amount of profit earned for that product, and displays the results on the screen.
 */

package com.challenges;

import javax.swing.*;

public class CircuitBoardProfit {
    public static void main(String [] args) {

        // Declare Variables
        double retailPrice;
        final double PROFIT_PERCENTAGE = 0.4;
        double profit;

        String userOutputString = JOptionPane.showInputDialog("Please enter the retail price of the product");
        retailPrice = Double.parseDouble(userOutputString);

        profit = retailPrice * PROFIT_PERCENTAGE;

        JOptionPane.showMessageDialog(null, "The profit earned on " + retailPrice + " is " + profit);

        System.exit(0);
    }
}
