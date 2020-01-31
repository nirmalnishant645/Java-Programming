/*
Write a program that accepts four integers from the user
And Print equal if all four are equal, and not equal otherwise
*/

import java.util.Scanner;

public class Equal {
	public static void main (String[] args) {

		int a, b, c, d;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		a = sc.nextInt();
		System.out.println("Enter second number: ");
		b = sc.nextInt();
		System.out.println("Enter third number: ");
		c = sc.nextInt();
		System.out.println("Enter fourth number: ");
		d = sc.nextInt();

		if (a == b && b == c && c == d) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
	}
}
