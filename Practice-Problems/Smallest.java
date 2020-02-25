/*
Write a Java Program to find the k smallest elements in a given array.
Elements in the array can be in any order
*/

import java.util.*;

public class Smallest {
	public static void main (String[] args) {

		int n, i, k;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of array: ");
		n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the elements of the array: ");		
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		} 
		
		System.out.println("Enter the value of 'k': ");
		k = sc.nextInt();

		Arrays.sort(arr);

		System.out.println("k smallest elements in the array are: ");
		for(i = 0; i < k; i++) {
			System.out.println(arr[i]);
		}
	}
}
