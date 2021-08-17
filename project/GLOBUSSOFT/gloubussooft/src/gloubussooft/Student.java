package gloubussooft;
import java.util.*;

public class Student 
{
	static void option()
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of students in the class");
	int n=sc.nextInt();
	char ar[][] =new char[n][n];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.println("enter the review of student:"+i+1+"for student:"+j+1);
			String temp=sc.next();
			ar[i][j]=temp.charAt(0);
		}
	}
	
	int ct=0; //counting true value.
	int cl=0;// counting lie value.
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(ar[i][j]=='T'||ar[i][j]=='t')
				ct++;
			else
				cl++;
		}
	}
	
	 /*{
	   if(ct==(n*n))
	   if((n*n)%2==0 )System.out.println("PARADOX");
	  }*/
	
	if(ct>cl)
	{
		System.out.println("atlist liyer:" +cl+"almost liyer:"+(ct/2-1));
	}
		//else if(ct<cl)
			//System.out.println("atlist:" +ct+"almost"+cl);
		
		else if(ct==cl)
		 System.out.println("atlist liyer:"+cl+"almost liyer:"+ct);
		
		else
			System.out.println("paradox");
	}
	
	
	public static void main(String [] args)
	{
		Scanner sc= new Scanner( System.in);
		System.out.println("enter the number of casess");
		int limit=sc.nextInt();
		
		for(int i=1;i<=limit;i++)
		{
			option();
		}
	}
}
		
		
	
	

