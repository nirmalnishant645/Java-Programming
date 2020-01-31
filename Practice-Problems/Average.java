/*
Write a Java Program to find the numbers greater than the average of the numbers of a given array
*/

import java.util.*;

public class Average {
	public static void main (String[] args) {

		int n, i;
		float avg = 0;		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of array: ");
		n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the elements of the array: ");		
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		} 
		
		for(i = 0; i < n; i++) {
			avg = avg + arr[i];
		}

		avg = avg/n;

		System.out.println("Average is " + avg);
		System.out.println("Numbers greater than the average are: ");
		for(i = 0; i < n; i++) {
			if (arr[i] >= avg) {

				System.out.println(arr[i]);
			}
		}
	}
}
