/*
The date June 10, 1960, is special because when we write it in the following format,
the month times the day equals the year:

6/10/60

Write a program that asks the user to enter a month (in numeric form), a day, and a two digit year.
The program should then determine whether the month times the day is equal to the year.
If so, it should display a message saying the date is magic.
Otherwise, it should display a message saying the date is not magic.
 */

package com.challenges;

import javax.swing.*;

public class MagicDates {
    public static void main(String [] args) {

        // Declare Variables
        String userInputString;
        int month;
        int day;
        int year;

        // Ask for Month
        userInputString = JOptionPane.showInputDialog("Please enter a month in numeric form: ");
        month = Integer.parseInt(userInputString);

        // Ask for Day
        userInputString = JOptionPane.showInputDialog("Please enter a day of the month: ");
        day = Integer.parseInt(userInputString);

        // Ask for year
        userInputString = JOptionPane.showInputDialog("Please enter last two digits of the year: ");
        year = Integer.parseInt(userInputString);

        if(month * day == year) {

            JOptionPane.showMessageDialog(null, "The date " + month + "/" + day + "/" + year + " is magic.");
        }
        else {
            JOptionPane.showMessageDialog(null, "The date " + month + "/" + day + "/" + year + " is NOT magic.");
        }

        System.exit(0);
    }
}
