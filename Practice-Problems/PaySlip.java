/*
Create a class MyDate with day, month and year as members.
Write appropriate member functions. 
Create another class Employee, which has id, name, date of birth, date of joining and salary as members (use MyDate for date fields).
Write appropriate constructor for the Employee which assigns values to the members.
Accept the details as command line arguments and create a Employee object using the arguments. Display the payslip details in a proper format.
*/

class MyDate {
	public int day, month, year;
	
	public MyDate() {
	}
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
}

class Employee {
	
	private int id, salary;
	private string name, dob, doj;

	public Employee() {
	}
	
	public Employee(int id, string name, string dob, string doj, int salary) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
		this.salary = salary;
	}
}

public class  PaySlip {
	public static void main(String[] args) {
		
	}
}
