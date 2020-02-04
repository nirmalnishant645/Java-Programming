/*
Create a class MyDate with day, month and year as members.
Write appropriate member functions. 
Create another class Employee, which has id, name, date of birth, date of joining and salary as members (use MyDate for date fields).
Write appropriate constructor for the Employee which assigns values to the members.
Accept the details as command line arguments and create a Employee object using the arguments.
Display the payslip details in a proper format.
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

	String day() {

		return (day + "/" + month + "/" + year);

	}
}

class Employee {
	
	private int id, salary;
	private String name, dob, doj;

	public Employee() {
	}
	
	public Employee(int id, String name, String dob, String doj, int salary) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
		this.salary = salary;
	} 

	void display() {

		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Date of Birth: " + dob);
		System.out.println("Date of Joining: " + doj);
		System.out.println("Salary: " + salary);

	}
}

public class  PaySlip {
	public static void main(String[] args) {
		
		int id = Integer.parseInt(args[0]);
		String name = args[1];
		int dateB = Integer.parseInt(args[2]);
		int monthB = Integer.parseInt(args[3]);
		int yearB = Integer.parseInt(args[4]);
		int dateJ = Integer.parseInt(args[5]);
		int monthJ = Integer.parseInt(args[6]);
		int yearJ = Integer.parseInt(args[7]);
		int salary = Integer.parseInt(args[8]);

		MyDate doB = new MyDate(dateB, monthB, yearB);
		MyDate doJ = new MyDate(dateJ, monthJ, yearJ);

		String dob = doB.day();
		String doj = doJ.day();

		Employee emp1 = new Employee(id, name, dob, doj, salary);

		emp1.display();		

	}
}

/*
Output:
$ java PaySlip 001 Nishant 24 10 1997 10 08 2019 50000
ID: 1
Name: Nishant
Date of Birth: 24/10/1997
Date of Joining: 10/8/2019
Salary: 50000
*/
