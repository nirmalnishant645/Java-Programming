/*
Write a program for matrix addition.
The addition function should return the addition of the matrix.
*/

import java.io.*;
import java.util.Scanner;

class Matrix {

	int a1[][], a2[][];
	int r, c, i, j;

	Matrix(int a,int b) {
		
		r = a;
		c = b;
	}

	int[][] matrixInput() {

		Scanner sc = new Scanner(System.in);
		int m[][] = new int [r][c];
		a1 = new int[r][c];
		System.out.println("Enter "+r*c+" elements of 1st array:");
		for(i = 0; i < r; i++) {

			for(j=0;j<c;j++) {

				a1[i][j]=sc.nextInt();
				
			}
		}

		a2 = new int[r][c];
		System.out.println("Enter "+r*c+" elements of 2nd array:");

		for(i = 0; i < r; i++) {

			for(j = 0; j < c; j++) {

				a2[i][j]=sc.nextInt();
			}
		}
		for(i = 0;i < r; i++) {

			for(j = 0;j < c; j++){

				m[i][j] = a1[i][j] + a2[i][j];
			}
			
		}	

		System.out.println("Sum of matrix is:");
		return m;
	}
	public static void main(String args[]) {	

		int r,c;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows of 1st and 2nd  matrix: ");
		r = sc.nextInt();

		System.out.print("Enter the no of columns of 1st and 2nd matrix: ");
		c = sc.nextInt();

		int a3[][] = new int[r][c];
		Matrix n = new Matrix(r,c);
		a3 = n.matrixInput();

		for(int i=0;i<r;i++) {

			for(int j=0;j<c;j++) {

				System.out.print(a3[i][j]+" ");
			}

			System.out.println();
		}
	}
}

/*
$ java Matrix
Enter the no of rows of 1st and 2nd  matrix: 3
Enter the no of columns of 1st and 2nd matrix: 3
Enter 9 elements of 1st array:
1 2 3 1 2 3 1 2 3
Enter 9 elements of 2nd array:
3 2 1 3 2 1 3 2 1
Sum of matrix is:
4 4 4 
4 4 4 
4 4 4
*/
