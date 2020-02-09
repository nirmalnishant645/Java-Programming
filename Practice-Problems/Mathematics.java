import java.io.*;
import java.util.Scanner;
/*
Define a class MyMaths having two private int data members. 
Write a default constructor to initialize it to 0 and another constructor to initialize it to a value (Use this). 
Write methods additionIS, subtractionIs , divisionIs, and multiplicationIs.
Create an object in main. Use command line arguments to pass a value to the object
Hint : convert string argument to integer and perform the above tests.
Provide javadoc comments for all constructors and methods and generate the html help file.
*/
class MyMaths {
	private int a, b; //Initializing private integers

	public MyMaths() { //Initializing Default Constructor
		a = 0;
		b = 0;
	}
	public MyMaths(int a, int b) { //Initializing Parameterized Constructor
		this.a = a;
		this.b = b;
	}

	void additionIS() { //Method//Main Class to add the pair of numbers
		System.out.println("Addition: "+(a+b));
	}

	void subtractionIS() { //Method to subtract the pair of numbers
		System.out.println("Subtraction: "+(a-b));
	}

	void divisionIS() { //Method to divide the pair of numbers and give the result in float
		System.out.println("Division: "+((float)a/b));
	}

	void multiplicationIS() { //Method to multiply the pair of numbers
		System.out.println("Multiplication: "+(a*b));
	}
}

public class Mathematics { //Main Class
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]); // Passing arguments from terminal
		int b = Integer.parseInt(args[1]);
		
		MyMaths pair1 = new MyMaths(a, b); //Calling constructor and making a new object of class MyMaths

		// Calling every method of the MyMaths class		
	
		pair1.additionIS();
		pair1.subtractionIS();
		pair1.divisionIS();
		pair1.multiplicationIS();
	}
}

/*
Execution:
$ java Mathematics 6 5
Addition: 11
Subtraction: 1
Division: 1.2
Multiplication: 30

Making HTML File using javadoc

$ javadoc Mathematics.java
Loading source file Mathematics.java...
Constructing Javadoc information...
Standard Doclet version 1.7.0_65
Building tree for all the packages and classes...
Generating /Mathematics.html...
Generating /package-frame.html...$ java Mathematics 6 5
Addition: 11
Subtraction: 1
Division: 1.2
Multiplication: 30

Generating /package-summary.html...
Generating /package-tree.html...
Generating /constant-values.html...
Building index for all the packages and classes...
Generating /overview-tree.html...
Generating /index-all.html...
Generating /deprecated-list.html...
Building index for all classes...
Generating /allclasses-frame.html...
Generating /allclasses-noframe.html...
Generating /index.html...
Generating /help-doc.html...
*/
