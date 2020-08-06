/*
Write a program that asks the user to enter a number of seconds.

•  There are 60 seconds in a minute.
    If the number of seconds entered by the user is greater than or equal to 60,
    the program should display the number of minutes in that many seconds.

•  There are 3,600 seconds in an hour.
    If the number of seconds entered by the user is greater than or equal to 3,600,
    the program should display the number of hours in that many seconds.

•  There are 86,400 seconds in a day.
    If the number of seconds entered by the user is greater than or equal to 86,400,
    the program should display the number of days in that many seconds.
 */

package com.challenges;

import java.util.Scanner;

public class TimeCalculator {
    public static void main(String [] args) {

        // Declare Variables
        int noOfSecs;
        final int SECS_PER_MIN = 60;
        final int SECS_PER_HOUR = 3600;
        final int SECS_PER_DAY = 86400;
        int days;
        int hours;
        int minutes;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of seconds: ");
        noOfSecs = scanner.nextInt();

        if(noOfSecs >= SECS_PER_DAY) {

            days = noOfSecs / SECS_PER_DAY;
            System.out.printf("The number of days in %d seconds = %d\n", noOfSecs, days);
            noOfSecs %= SECS_PER_DAY;

            if(noOfSecs > SECS_PER_HOUR) {

                hours = noOfSecs / SECS_PER_HOUR;
                System.out.printf("The number of hours in the remaining %d seconds = %d\n", noOfSecs, hours);
                noOfSecs %= SECS_PER_HOUR;
            }

            if(noOfSecs > SECS_PER_MIN) {

                minutes = noOfSecs / SECS_PER_MIN;
                System.out.printf("The number of minutes in the remaining %d seconds = %d\n", noOfSecs, minutes);
                noOfSecs %= SECS_PER_MIN;
            }

            if(noOfSecs > 0) {

                System.out.printf("The number of remaining seconds = %d\n", noOfSecs);
            }

        }
        else if(noOfSecs >= SECS_PER_HOUR) {

            hours = noOfSecs / SECS_PER_HOUR;
            System.out.printf("The number of hours in %d seconds = %d\n", noOfSecs, hours);
            noOfSecs %= SECS_PER_HOUR;

            if(noOfSecs > SECS_PER_MIN) {

                minutes = noOfSecs / SECS_PER_MIN;
                System.out.printf("The number of minutes in the remaining %d seconds = %d\n", noOfSecs, minutes);
                noOfSecs %= SECS_PER_MIN;
            }

            if(noOfSecs > 0) {

                System.out.printf("The number of remaining seconds = %d\n", noOfSecs);
            }
        }
        else if(noOfSecs >= SECS_PER_MIN) {

            minutes = noOfSecs / SECS_PER_MIN;
            System.out.printf("The number of minutes in %d seconds = %d\n", noOfSecs, minutes);
            noOfSecs %= SECS_PER_MIN;

            if(noOfSecs > 0) {

                System.out.printf("The number of remaining seconds = %d\n", noOfSecs);
            }
        }
        else {
            System.out.printf("The number of seconds, %d, is less than even a minute.", noOfSecs);
        }
    }
}