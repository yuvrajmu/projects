package gloubussooft;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver 
{

	public static void main(String[] args) 
	{
		
				Scanner sc=new Scanner (System.in);
				ArrayList<CardStack> a = new ArrayList<CardStack>();
				double temp=1;
				while(temp !=0.00)
				{
					temp =sc.nextDouble();
					if(temp!=0.00)
					{
						a.add(new CardStack(temp));
						
					}
				}
				sc.close();
				for(int i=0;i<a.size();i++)
				{
					System.out.println(a.get(i).calculate()+"card(s)");
				}
	}

		

}


