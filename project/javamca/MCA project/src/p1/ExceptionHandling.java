package p1;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a,b, result;
		Scanner input=new Scanner(System.in);
		System.out.println("input two integer");
		a=input.nextInt();
		b=input.nextInt();
		try {
			result=a/b;
			System.out.println("Result="+result);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught : Division by zero ");
		}
		

	}

}
