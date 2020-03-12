import java.io.*;

public class DLL
{
	public void doubly(int n,String node[])
	{
		System.out.print("Displaying Doubly Linked List: ");
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				System.out.print("X<-");
			}
			if(i==n-1)
			{
				System.out.print(node[i]+"->X");
			}
			else
			{
				System.out.print(node[i]+"-><-");
			}
		}
	}   
}
