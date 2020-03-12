import java.io.*;

public class SLL
{
	public void single(int n,String node[])
	{
		System.out.print("Displaying Singly Linked List: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(node[i]+"->");
			if(i==n-1)
				System.out.print("X");
		}
		System.out.println();
	}
}
