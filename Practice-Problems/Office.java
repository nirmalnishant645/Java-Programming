/*
Define an Employee class (name, position, salary).
Define a default and parameterized constructor.
Override the toString method. Keep a count objects created. 
Create objects using parameterized constructor and display the object count after each object is created. 
(Use static member and method). Also display the contents of each object.
*/
import java.util.Scanner;

class Employee {
	
	private String name, position; //Initializing variables
	private int salary; 
	static int count;
	{
		count++;  //Static block
	}
	public Employee() { //Initializing Default Constructor
		
		name = "";
		position = "";
		salary = 0;

	}

	public Employee(String name, String position, int salary) { //Initializing Parameterized Constructor
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	public String toString() { //Overriding toString()
		return "Name: "+name+" Position: "+position+" Salary: "+salary;
	}
}
	

public class Office { //Main Class
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Declare an object of Scanner class and initialize with predifined standard input object
		 
		System.out.println("Enter the name of the Employee: ");
		String name = sc.next(); //Input of name
		
		System.out.println("Enter the position of the Employee: ");
		String position = sc.next(); //Input of position
		
		System.out.println("Enter the salary of the Employee: ");
		int salary = sc.nextInt(); //Input of Salary

		Employee emp1 = new Employee(name, position, salary); //Calling constructor and making a new object of employee class
		Employee emp2 = new Employee();

		System.out.println("Total objects created: "+Employee.count); //Printing the total number of objects created from static block
		System.out.println(emp1); //Printing the details of the object
		
	}
}

/*
$ java Office
Enter the name of the Employee: 
Nishant
Enter the position of the Employee: 
HR
Enter the salary of the Employee: 
100
Total objects created: 1
Name: Nishant Position: HR Salary: 100
*/
