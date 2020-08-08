/*
Write a program that asks the user to enter three names, and then displays the names sorted in ascending order.
For example,
If the user entered “Charlie”, “Leslie”, and “Andy”, the program would display:

Andy
Charlie
Leslie
 */

package com.challenges;

import java.util.Scanner;

public class SortedNames {
    public static void main(String [] args) {

        // Declare Variables

        String nameOne;
        String nameTwo;
        String nameThree;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first name: ");
        nameOne = scanner.nextLine();

        System.out.println("Please enter the second name: ");
        nameTwo = scanner.nextLine();

        System.out.println("Please enter the third name: ");
        nameThree = scanner.nextLine();

        if(nameOne.compareToIgnoreCase(nameTwo) < 0 && nameOne.compareToIgnoreCase(nameThree) < 0) {

            System.out.println(nameOne);

            if(nameTwo.compareToIgnoreCase(nameThree) < 0) {

                System.out.println(nameTwo);
                System.out.println(nameThree);
            }
            else {

                System.out.println(nameThree);
                System.out.println(nameTwo);
            }
        }

        else if(nameTwo.compareToIgnoreCase(nameOne) < 0 && nameTwo.compareToIgnoreCase(nameThree) < 0) {

            System.out.println(nameTwo);

            if(nameOne.compareToIgnoreCase(nameThree) < 0) {

                System.out.println(nameOne);
                System.out.println(nameThree);
            }
            else {

                System.out.println(nameThree);
                System.out.println(nameOne);
            }
        }

        else {

            System.out.println(nameThree);

            if(nameOne.compareToIgnoreCase(nameTwo) < 0) {

                System.out.println(nameOne);
                System.out.println(nameTwo);
            }
            else {

                System.out.println(nameTwo);
                System.out.println(nameOne);
            }
        }
    }
}
