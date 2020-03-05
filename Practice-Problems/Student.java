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
	float per;
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

	}
	
	float per(int sub1, int sub2, int sub3, int sub4, int sub5, int sub6) {

		percent = (sub1 + sub2 + sub3 + sub4 + sub5 + sub6) / 6;
		return per;
	}
	
	void dislpay() {
		
		System.out.println("Roll No :- "+roll_no);
		System.out.println("Name :- "+name);
		System.out.println("Class :- "+_class);
		System.out.println("Percentage :- "+per);

	}

	public static void sortStudent(Student s[], int n) {

		int i, j;
		Student temp:

		for (i = 0; i < n; i++) {
			
			for (j = i + 1; j < n; j++) {

				if (s[i].per() > s[j].per) {

					temp = s[i];
					s[i] = s[j];
					s[j] = temp;

				}
			}
		}
	}

	public static void main(String[] args) {
		
		scanner sc = new Scanner(System.in);
		System.out.print("Enter the total number of Students: ");
		int n = sc.nextInt();
		Student[] s = new Student[n];
		
		for (int i = 0; i < n; i++) {

			System.out.print("Enter Roll Number of Student: ");
			int roll_no = sc.nextInt();
			System.out.print("Enter Name of Student: ");
			String name = sc.next();
			System.out.print("Enter Class of Srudent: ");
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
		}

		System.out.println("Student's Info: ");
		for(int i = 0; i < n; i++) {
			
			s[i].display();
	
		}
		
		sorStudent(s, n);
		
		System.out.println("Sorted Student's Info: ");
		for (int - = 0; i < n; i++) {
			s[i].display();
		}			
	}

}
