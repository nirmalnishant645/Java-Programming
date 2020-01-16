// Using Constructor in Java
class Student {
	String id, name, address; //Initialising variables of the class

	Student (String id, String name, String address) { //Initialising a parameterized constructor
		this.id = id; //'this' is similar to 'self' in python, used to point out the variable of the constrcutor method
		this.name = name;
		this.address = address;
	}

	void display () { //Method to display the information of the object
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}

public class School {
	public static void main(String[] args) {
		String id, name, address; //Initialising Global Variable
		Student stud1 = new Student("A101", "Nishant", "Pune"); //Calling Constructor and making a new object
		stud1.display(); //Calling the method to display the information
	}
}
