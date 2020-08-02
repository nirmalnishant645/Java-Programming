/*
A soft drink company recently surveyed 12,467 of its customers and found that
approximately 14 percent of those surveyed purchase one or more energy drinks per week.
Of those customers who purchase energy drinks, approximately 64 percent of them prefer citrus-flavored energy drinks.
Write a program that displays the following:
•  The approximate number of customers in the survey who purchase one or more energy drinks per week
•  The approximate number of customers in the survey who prefer citrus-flavored energy drinks

 */

package com.challenges;

public class EnergyDrinkConsumption {
    public static void main(String [] args) {

        // Declare Variables
        int noOfCustomers = 12467;
        final double REGULAR_CONSUMER_PERCENTAGE = 0.14;
        final double CITRUS_CONSUMER_PERCENTAGE = 0.64;
        double totalRegularConsumers;
        double totalCitrusConsumer;

        totalRegularConsumers = noOfCustomers * REGULAR_CONSUMER_PERCENTAGE;
        totalCitrusConsumer = totalRegularConsumers * CITRUS_CONSUMER_PERCENTAGE;

        System.out.println("Total number of customers surveyed: " + noOfCustomers);
        System.out.println("Approximate number of regular customers: " + (int)totalRegularConsumers);
        System.out.println("Approximate number of citrus consumers: " + (int)totalCitrusConsumer);
    }
}
