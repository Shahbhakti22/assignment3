import java.util.*;
public class Assign3e
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner (System.in);
		int a;
		
		a=sc.nextInt();
		
		System.out.println("The result is:" + (a++));
		System.out.println("decremenet:"+ (a--));
	}

}