/*
Write a program that plays a word game with the user. The program should ask the user to enter the following:

•  His or her name
•  His or her age
•  The name of a city
•  The name of a college
•  A profession
•  A type of animal
•  A pet’s name

After the user has entered these items, the program should display the following story,
inserting the user’s input into the appropriate locations:

There once was a person named NAME who lived in CITY.
At the age of AGE, NAME went to college at COLLEGE.
NAME graduated and went to work as a PROFESSION.
Then, NAME adopted a(n) ANIMAL named PET_NAME.
They both lived happily ever after!
 */

package com.challenges;

import java.util.Scanner;

public class WordGame {
    public static void main(String [] args) {

        // Declare Variables
        String name;
        int age;
        String city;
        String college;
        String profession;
        String animal;
        String petName;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Please enter your age: ");
        age = scanner.nextInt();
        
        scanner.nextLine(); // To encounter the line break that is left by scanner.nextInt()

        System.out.println("Please enter the name of a city: ");
        city = scanner.nextLine();

        System.out.println("Please enter the name of a college: ");
        college = scanner.nextLine();

        System.out.println("Please enter a profession: ");
        profession = scanner.nextLine();

        System.out.println("Please enter a type of animal: ");
        animal = scanner.nextLine();

        System.out.println("Please enter the name of a pet: ");
        petName = scanner.nextLine();

        System.out.println("There once was a person named " + name + " who lived in " + city + ".");
        System.out.println("At the age of " + age + ", " + name + " went to college at " + college + ".");
        System.out.println(name + " graduated and went to work as a " + profession + ".");
        System.out.println("Then, " + name + " adopted a(n) " + animal + " named " + petName + ".");
        System.out.println("They both lived happily ever after!");
    }
}
