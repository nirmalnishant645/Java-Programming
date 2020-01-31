/*
Write a Java program that accepts two double variable
And test if both are strictly between 0 and 1 and false otherwise
*/

import java.util.Scanner;

public class ZeroOne {
	public static void main (String[] args) {
		
		String a, b;
		double c, d;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		a = sc.next();
		c = Double.parseDouble(a);
		
		System.out.println("Enter the second number: ");
		b = sc.next();
		d = Double.parseDouble(b);
	
		if (c > 0 && c < 1 && d > 0 && d < 1) {
			System.out.println("True");
		}
		
		else {
			System.out.println("False");
		}

	}
}
