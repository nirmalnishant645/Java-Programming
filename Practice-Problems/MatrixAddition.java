/*
Write a program for matrix addition.
The addition function should return the addition of the matrix.
*/
public class MatrixAddition
{
    static final int N = 4;

    // This function adds A[][] and B[][], and stores
    // the result in C[][]
    static void add(int A[][], int B[][], int C[][])
    {
        int i, j;
        for (i = 0; i < N; i++)
            for (j = 0; j < N; j++)
                C[i][j] = A[i][j] + B[i][j];
    }

    // Driver code
    public static void main (String[] args)
    {
        int A[][] = { {1, 1, 1, 1},
                        {2, 2, 2, 2},
                        {3, 3, 3, 3},
                        {4, 4, 4, 4}};

        int B[][] = { {1, 1, 1, 1},
                        {2, 2, 2, 2},
                        {3, 3, 3, 3},
                        {4, 4, 4, 4}};

        // To store result
        int C[][] = new int[N][N];
        int i, j;
        add(A, B, C);

        System.out.print("Result matrix is: \n");
        for (i = 0; i < N; i++)
        {
            for (j = 0; j < N; j++)
            System.out.print(C[i][j] + " ");
            System.out.print("\n");
        }
    }
}
