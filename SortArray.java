/*
Read One-Dimensional Array 'A' and sort it in ascending order.
WAP for the above mentioned task of reading array and sorting the array.
*/

import java.util.*;

public class assignment2 {
	
	public static void main(String args[]) {
	    
		Scanner sc = new Scanner(System.in);
		
		
		int n,temp,i,j;
		
		System.out.println("Enter the total number of elements in the array: ");
		
		n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the elements: ");
		
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		for(i=0;i<n-1;i++) {
		    
			for(j=0;j<n;j++) {
			    
				if(a[i]<a[j]) {
				    
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
