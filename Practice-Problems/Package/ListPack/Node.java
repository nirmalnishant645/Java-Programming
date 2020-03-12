/*
Create a package called ‘ListPack’ which contains the classes ‘Node’, ‘singLinkedList’ , ‘dablLinkedList’ and ‘cirLinkedList’.
Write a program to create a linked list of 5 nodes in main (type will be define by user) and display the elements.
The elements are passed as command line arguments.
*/

import java.io.*;

public class Node {

     public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n,ch;

		System.out.print("Number of nodes: ");

		n = Integer.parseInt(br.readLine());

		System.out.println("Enter data for nodes:");

		String node[] = new String[n];

		for(int i = 0; i < n; i++)
			node[i] = br.readLine();
		do {
			
			System.out.println("\n1.Display Singly Linked List\n2.Display Doubly Linked List\n3.Display Circular Linked List\n4.Exit\n");
			System.out.print("Enter the option for type of Linked List to display: ");

			ch = Integer.parseInt(br.readLine());

			switch(ch) {

				case 1:	SLL sll = new SLL();
                              sll.single(n, node);
                              break;

				case 2:	DLL dll = new DLL();
                              dll.doubly(n, node);
                              break;

				case 3:	CLL cll = new CLL();
                              cll.circular(n, node);
                              break;

				case 4:	System.exit(0);
			}
		}while(ch != 4);
     }
}
/*
$ java Node
Number of nodes: 5
Enter data for nodes:
4
7
8
3
9

1.Display Singly Linked List
2.Display Doubly Linked List
3.Display Circular Linked List
4.Exit

Enter the option for type of Linked List to display: 1
Displaying Singly Linked List: 4->7->8->3->9->X

1.Display Singly Linked List
2.Display Doubly Linked List
3.Display Circular Linked List
4.Exit

Enter the option for type of Linked List to display: 2
Displaying Doubly Linked List: X<-4-><-7-><-8-><-3-><-9->X
1.Display Singly Linked List
2.Display Doubly Linked List
3.Display Circular Linked List
4.Exit

Enter the option for type of Linked List to display: 3
Displaying Circular Linked List: 9<-4-><-7-><-8-><-3-><-9->4
1.Display Singly Linked List
2.Display Doubly Linked List
3.Display Circular Linked List
4.Exit

Enter the option for type of Linked List to display: 4
*/
