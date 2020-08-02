/*
Kathryn bought 600 shares of stock at a price of $21.77 per share.
She must pay her stockbroker a 2 percent commission for the transaction.
Write a program that calculates and displays the following:
•  The amount paid for the stock alone (without the commission)
•  The amount of the commission
•  The total amount paid (for the stock plus the commission)
 */

package com.challenges;

public class StockCommission {
    public static void main(String [] args) {

        // Declare Variables

        int noOfShares = 600;
        final double STOCK_PRICE = 21.77;
        final double COMMISSION_PERCENT = 0.02;
        double totalStockAmt;
        double totalCommissionAmt;
        double totalAmt;

        totalStockAmt = noOfShares * STOCK_PRICE;
        totalCommissionAmt = totalStockAmt * COMMISSION_PERCENT;
        totalAmt = totalStockAmt + totalCommissionAmt;

        System.out.println("The amount paid for the stock (without commission: " + totalStockAmt);
        System.out.println("The amount of commission: " + totalCommissionAmt);
        System.out.println("Total Amount Paid: " + totalAmt);

    }
}
