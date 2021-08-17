package p1;

import java.util.Scanner;

public class MultipleCatchBlockDemo {
	
 static void checkbound() throws ArrayIndexOutOfBoundsException 
 { String languages[] = {"C", "C++", "Java", "Perl", "Python" } ; 
 for (int c = 1; c <=5; c++) { 
 System.out.println(languages[c]); 
} 
 }
 
public static void main(String[] args) {
	

int a, b, result; 

Scanner input = new Scanner(System.in);
System.out.println("lnput two integers"); 
a = input.nextInt();
b = input.nextInt(); 
try {
	result = a / b;
	System.out.println("Result = " + result);
	checkbound(); 
}
catch (ArithmeticException e) { 
	System.out.println("Exception caught: Division by zero.");
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
}
catch(Exception e) {
	System.out.println("Exception caught:"+e.getLocalizedMessage());
	
}
System.out.println("End of the program");
}


}
