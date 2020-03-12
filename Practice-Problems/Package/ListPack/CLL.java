import java.io.*;

public class CLL
{
	public void circular(int n,String node[])
	{
		System.out.print("Displaying Circular Linked List: ");
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				System.out.print(node[n-1]+"<-");
			}
			if(i==n-1)
			{
				System.out.print(node[i]+"->"+node[n-i-1]);
			}
			else
			{
				System.out.print(node[i]+"-><-");
			}
		}
	}
}
