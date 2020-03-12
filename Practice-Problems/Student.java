/*
Define a class Student (name, roll_no, class and marks of 6 subjects).
Create an array of n Student objects.
Calculate the percentage of each student using a method per().
Define a static method “sortStudent” which sorts the array on the basis of percentage.
Display the student details in sorted order.
*/
import java.io.*;
import java.util.*;

class Student {

	int roll_no, sub1, sub2, sub3, sub4, sub5, sub6;
	String name, _class;
	float percent;

	float per(int sub1, int sub2, int sub3, int sub4, int sub5, int sub6) {

		percent = (sub1 + sub2 + sub3 + sub4 + sub5 + sub6) / 6;
		return percent;
	}
	
	Student() {
	}
	 
	Student(int roll_no, String name, String _class, int sub1, int sub2, int sub3, int sub4, int sub5, int sub6) {
		
		this.roll_no = roll_no;
		this.name = name;
		this._class = _class;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		this.sub6 = sub6;
		this.percent = per(sub1, sub2, sub3, sub4, sub5, sub6);

	}
	
	void display() {
		
		System.out.println("Roll No :- "+roll_no);
		System.out.println("Name :- "+name);
		System.out.println("Class :- "+_class);
		System.out.println("Percentage :- "+percent);

	}

	public static void sortStudent(Student s[], int n) {

		int i, j;
		Student temp;

		for (i = 0; i < n; i++) {
			
			for (j = i + 1; j < n; j++) {

				if (s[i].percent > s[j].percent) {

					temp = s[i];
					s[i] = s[j];
					s[j] = temp;

				}
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total number of Students: ");
		int n = sc.nextInt();
		Student[] s = new Student[n];
		
		for (int i = 0; i < n; i++) {

			System.out.print("Enter Roll Number of Student: ");
			int roll_no = sc.nextInt();
			System.out.print("Enter Name of Student: ");
			String name = sc.next();
			System.out.print("Enter Class of Student: ");
			String _class = sc.next();
			System.out.print("Enter Marks of Subject1: ");
			int sub1 = sc.nextInt();
			System.out.print("Enter Marks of Subject2: ");
			int sub2 = sc.nextInt();
			System.out.print("Enter Marks of Subject3: ");
			int sub3 = sc.nextInt();
			System.out.print("Enter Marks of Subject4: ");
			int sub4 = sc.nextInt();
			System.out.print("Enter Marks of Subject5: ");
			int sub5 = sc.nextInt();
			System.out.print("Enter Marks of Subject6: ");
			int sub6 = sc.nextInt();

			s[i] = new Student(roll_no, name, _class, sub1, sub2, sub3, sub4, sub5, sub6);
		}

		System.out.println("Student's Info: ");
		for(int i = 0; i < n; i++) {
			
			s[i].display();
	
		}
		
		sortStudent(s, n);
		
		System.out.println("Sorted Student's Info: ");
		for (int i = 0; i < n; i++) {
			s[i].display();
		}			
	}

}

/*
$ java Student
Enter the total number of Students: 3
Enter Roll Number of Student: 1
Enter Name of Student: Nishant
Enter Class of Student: 1
Enter Marks of Subject1: 90
Enter Marks of Subject2: 80
Enter Marks of Subject3: 70
Enter Marks of Subject4: 60
Enter Marks of Subject5: 50
Enter Marks of Subject6: 40
Enter Roll Number of Student: 2
Enter Name of Student: Gaurav
Enter Class of Student: 1
Enter Marks of Subject1: 91
Enter Marks of Subject2: 92
Enter Marks of Subject3: 93
Enter Marks of Subject4: 94
Enter Marks of Subject5: 95
Enter Marks of Subject6: 96
Enter Roll Number of Student: 3
Enter Name of Student: Swapnil
Enter Class of Student: 1
Enter Marks of Subject1: 81
Enter Marks of Subject2: 82
Enter Marks of Subject3: 83
Enter Marks of Subject4: 84
Enter Marks of Subject5: 85
Enter Marks of Subject6: 86
Student's Info: 
Roll No :- 1
Name :- Nishant
Class :- 1
Percentage :- 65.0
Roll No :- 2
Name :- Gaurav
Class :- 1
Percentage :- 93.0
Roll No :- 3
Name :- Swapnil
Class :- 1
Percentage :- 83.0
Sorted Student's Info: 
Roll No :- 1
Name :- Nishant
Class :- 1
Percentage :- 65.0
Roll No :- 3
Name :- Swapnil
Class :- 1
Percentage :- 83.0
Roll No :- 2
Name :- Gaurav
Class :- 1
Percentage :- 93.0
*/
