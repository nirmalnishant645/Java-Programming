/*
A bag of cookies holds 40 cookies.
The calorie information on the bag claims that there are 10 servings in the bag and that a serving equals 300 calories.
Write a program that lets the user enter the number of cookies he or she actually ate and then reports the number of total calories consumed.
 */

package com.challenges;

import javax.swing.*;

public class CookieCalories {
    public static void main(String [] args) {

        // Declare Variables
        String userStringOutput;
        double noOfCookies;
        double noOfServings;
        double noOfCalories;

        /*
        The JOptionPane class is used to provide standard dialog boxes such as message dialog box, confirm dialog box and input dialog box.
        These dialog boxes are used to display information or get input from the user.
         */

        userStringOutput = JOptionPane.showInputDialog("Enter the number of cookies: ");
        noOfCookies = Double.parseDouble(userStringOutput);
        noOfServings = (noOfCookies / 40) * 10;
        noOfCalories = noOfServings * 300;

        JOptionPane.showMessageDialog(null, noOfCookies + " cookies is equal to " + noOfCalories + " calories");
        
        System.exit(0);
    }
}
