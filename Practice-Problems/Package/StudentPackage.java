/*
Write a program to create a Package “MCA_I” which has a class McaIMarks (members – SemITotal, SemIITotal).
Create another package MCA_II which has a class McaIIMarks (members – SemITotal, SemIITotal ).
Create n objects of Student class (having rollNumber, name, McaIMarks and McaIIMarks).
Add the marks of McaI and McaII calculate the Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for >= 50 , Pass Class for >=40 else ‘FAIL’)
and display the result of the student in proper format.
*/

import MCA1.*;
import MCA2.*;
import java.util.Scanner;

class StudentPackage {

	int rno,t1,t2;
	String name;
	Mca1 m1 = new Mca1();
	Mca2 m2 = new Mca2();

	StudentPackage() {
	}

	StudentPackage(int r, String n) {

		rno = r;
		name = n;
		m1.acceptData();
		m2.acceptData();

	}

	public void display() {

		System.out.println("\nRoll No: "+rno);
		System.out.println("Name: "+name);

		int t1 = m1.display();
		int t2 = m2.display();

		System.out.println("MCA1 Total :"+t1);
		System.out.println("MCA2 Total :"+t2);
		System.out.println("MCA1 + MCA2 Total Marks:"+(t1+t2));

		if(((t1 + t2) / 2) >= 70)
			System.out.println("Grade = A");
		else if(((t1 + t2) / 2) >= 60)
			System.out.println("Grade = B");
		else if(((t1 + t2) / 2) >= 50)
			System.out.println("Grade = C");
		else if(((t1 + t2) / 2) >= 40)
			System.out.println("Grade = PASS");
		else
			System.out.println("Grade = FAIL");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total number of students: ");

		int n = sc.nextInt();

		StudentPackage[] s = new StudentPackage[n];

		for(int i = 0; i < n; i++) {

			System.out.print("\nEnter Roll No: ");

			int rno = sc.nextInt();

			System.out.print("Enter Name: ");

			String name = sc.next();

			s[i] = new StudentPackage(rno,name);
			
		}

		System.out.println("\nStudent's Information: ");

		System.out.println("-------------------------------------");

		for(int i = 0;i < n; i++) {

			s[i].display();
		}
	}
}
/*
$ java StudentPackage
Enter the total number of students: 3

Enter Roll No: 1
Enter Name: Nishant
Enter MCA1 SEM 1 Marks: 90
Enter MCA1 SEM 2 Marks: 85
Enter MCA2 SEM 1 Marks: 95
Enter MCA2 SEM 2 Marks: 80

Enter Roll No: 2
Enter Name: Gaurav
Enter MCA1 SEM 1 Marks: 89
Enter MCA1 SEM 2 Marks: 79
Enter MCA2 SEM 1 Marks: 99
Enter MCA2 SEM 2 Marks: 69

Enter Roll No: 3
Enter Name: Swapnil
Enter MCA1 SEM 1 Marks: 100
Enter MCA1 SEM 2 Marks: 99
Enter MCA2 SEM 1 Marks: 98
Enter MCA2 SEM 2 Marks: 97

Student's Information: 
-------------------------------------

Roll No: 1
Name: Nishant
MCA1 Total :175
MCA2 Total :175
MCA1 + MCA2 Total Marks:350
Grade = A

Roll No: 2
Name: Gaurav
MCA1 Total :168
MCA2 Total :168
MCA1 + MCA2 Total Marks:336
Grade = A

Roll No: 3
Name: Swapnil
MCA1 Total :199
MCA2 Total :195
MCA1 + MCA2 Total Marks:394
Grade = A
*/
