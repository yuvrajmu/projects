package gloubussooft;
import java.util.*;
public class SolutonJoy 
{

	public static void main(String[] args)
	{
		int i;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of test casess");
		int num = sc.nextInt();
		
		for(int j=1;j<=num;j++)
		{
			System.out.println("Enter a number");
			int t=sc.nextInt();
			
			if(t==1 || t==2)
			
				System.out.println("1");
			
			else
			{
				int [] f=new int[t];
				f[0]=0;
				f[1]=1;
				
				for(i=2;i<t;i++)
				{
					f[i]=f[i-1]+f[i-2];
				}
				
				int a=1,temp,b=1;
				int sum=1;
				
				for(i=0;i<t-2;i++)
				{
					a=sum;temp=a;
					sum=2*a+b+f[i];
					b=temp;
				}
				System.out.println(sum+" ");
			}
		}
		
		sc.close();

	}

}
