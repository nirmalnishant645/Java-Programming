package MCA1;	
import java.util.*;

public class Mca1
{
	int sem1Total;
	int sem2Total; 
	public void acceptData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter MCA1 SEM 1 Marks: ");
		sem1Total=sc.nextInt();
		System.out.print("Enter MCA1 SEM 2 Marks: ");
		sem2Total=sc.nextInt();
	}
	public int display()
	{
		return sem1Total+sem2Total;
	}
}
