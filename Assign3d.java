import java.util.*;
public class Assign3d
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,res;
		
		System.out.println("Enter no:");
		a=sc.nextInt();
		b=sc.nextInt();
		
	
		System.out.println(a>b && b>a);
		
		System.out.println(a<b || b<a);
		
		System.out.println(!(a>b));
		
	}
}