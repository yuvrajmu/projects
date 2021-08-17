package gloubussooft;
import java.util.*;
public class HappyEidDay {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the velue between 1 to 50");
		int n=sc.nextInt();
		
		if(n>=1 && n<=50)
		{
			int m=n/3;
			int k=3*m;
			if(k==n)
			{
				System.out.println("case 1 : Happy Eid Day");
			}
			else
			{
				System.out.println("case 2 : Love-e pap pap-e polti ");
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
		

	}

}
