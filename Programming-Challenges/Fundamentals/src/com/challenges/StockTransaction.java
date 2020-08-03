/*
Last month Joe purchased some stock in Acme Software, Inc. Here are the details of the purchase:

•  The number of shares that Joe purchased was 1,000.
•  When Joe purchased the stock, he paid $32.87 per share.
•  Joe paid his stockbroker a commission that amounted to 2% of the amount he paid for the stock.

Two weeks later Joe sold the stock. Here are the details of the sale:

•  The number of shares that Joe sold was 1,000.
•  He sold the stock for $33.92 per share.
•  He paid his stockbroker another commission that amounted to 2% of the amount he received for the stock.

Write a program that displays the following information:
•  The amount of money Joe paid for the stock.
•  The amount of commission Joe paid his broker when he bought the stock.
•  The amount that Joe sold the stock for.
•  The amount of commission Joe paid his broker when he sold the stock.
•  Display the amount of profit that Joe made after selling his stock and paying the two commissions to his broker.
(If the amount of profit that your program displays is a negative number, then Joe lost money on the transaction.)
 */

package com.challenges;

public class StockTransaction {
    public static void main(String [] args) {

        // Declare Variables

        final int NO_OF_STOCKS = 1000;
        final double COST_PRICE = 32.87;
        final double COMMISSION_PERCENTAGE = 0.02;
        final double SELLING_PRICE = 33.92;
        double amtPaid;
        double buyingCommission;
        double amtReceived;
        double sellingCommission;
        double profit;

        amtPaid = NO_OF_STOCKS * COST_PRICE;
        buyingCommission = amtPaid * COMMISSION_PERCENTAGE;
        amtReceived = NO_OF_STOCKS * SELLING_PRICE;
        sellingCommission = amtReceived * COMMISSION_PERCENTAGE;
        profit = (amtReceived - sellingCommission) - (amtPaid + buyingCommission);

        System.out.println("Total Amount Paid by Joe: " + amtPaid);
        System.out.println("Total commission paid while buying: " + buyingCommission);
        System.out.println("Total Amount Received by Joe: " + amtReceived);
        System.out.println("Total commission paid while selling: " + sellingCommission);
        System.out.println("Total profit Joe made: " + profit);
        System.out.println("*If the amount of profit is negative, then Joe lost money on the transaction.");
    }
}
