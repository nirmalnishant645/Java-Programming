/*
One acre of land is equivalent to 43,560 square feet.
Write a program that calculates the number of acres in a tract of land with 389,767 square feet.
Hint: Divide the size of the tract of land by the size of an acre to get the number of acres.
 */

package com.challenges;

public class LandCalculation {
    public static void main(String [] args) {

        // Declare Variables
        final double oneAcre = 43560; // square feer
        double givenSize =  389767; // in square feet
        double numberOfAcres;

        numberOfAcres = givenSize / oneAcre;
        System.out.print(numberOfAcres + " acres");
    }
}