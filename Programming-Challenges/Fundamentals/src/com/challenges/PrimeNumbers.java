/*
Write a program to accept ‘n’ elements from the user and print all prime numbers.
Use suitable collection which do not accept duplicate elements.
*/

package com.challenges;

import java.util.*;

public class PrimeNumbers {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet linked_hash_set = new LinkedHashSet();

        int num;

        System.out.println("Enter the numbers (Press 0 to submit the numbers): ");

        while((num = scanner.nextInt()) != 0) {
            int flag = 0;
            for(int i = 2; i < num; i++) {
                if(num % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if(flag == 0) {
                linked_hash_set.add(num);
            }
        }

        System.out.println("The Prime Numbers are: " + linked_hash_set);
    }
}