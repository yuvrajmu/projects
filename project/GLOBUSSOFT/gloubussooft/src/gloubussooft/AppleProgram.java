package gloubussooft;
import java.math.BigInteger;
import java.util.*;
public class AppleProgram 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.println("No if apples belongs to Klaudia :");
			BigInteger numberOfApple = sc.nextBigInteger();
			System.out.println("number of diffrence");
			BigInteger difference =sc.nextBigInteger();
			BigInteger temp = numberOfApple.subtract(difference);
			temp=temp.divide(BigInteger.valueOf(2));
			System.out.println(temp.add(difference));
			System.out.println(temp);
		}
	}

}
