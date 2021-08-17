package p1;

import java.util.Scanner;

public class StringHandling {

	public static void main(String[] args) {
		String s1,s2;
		int ch,p1,p2;
		char c1,c2;
		Scanner in = new Scanner(System.in);
		System.out.println("/t/t/t String Handling");
		do {
			System.out.println("/t/t/t String Handling Manu");
			System.out.println("1.Concatination");
			System.out.println("2.chatAt");
			System.out.println("3.indexOf");
			System.out.println("4.subString");
			System.out.println("5.Replace");
			System.out.println("6.Equals");
			System.out.println("7.Exit");
			System.out.println("ENTER YOUR CHOICE:");
			ch =in.nextInt();
			switch(ch) {
			case 1:
					System.out.println("Enter the first string:");
					s1 = in.next();
					System.out.println("Enter the second string");
					s2=in.next();
					System.out.println("THE CONCATINATED STRING IS " +s1.concat(s2));
					break;
					
			case 2:
					System.out.println("Enter the string");
					s1=in.next();
					System.out.println("Enter the position to find charecter");
					p1=in.nextInt();
					c1=s1.charAt(p1);
					System.out.println("The Charecter At position "+p1+"is:"+c1);
					break;
			case 3:
					System.out.println("Enter the strimg");
					s1=in.next();
					System.out.println("Enter the charecter to find position:");
					s2=in.next();
					c1=s2.charAt(0);
					System.out.println("The position of charecter "+c1+"is:"+s1.indexOf(c1));
					break;
			case 4:
					System.out.println("Enter the string");
					s1 = in.next();
					System.out.println("Enter the start position to retrive");
					p1=in.nextInt();
					System.out.println("Enter the end position of retrive:");
					p2=in.nextInt();
					s2=s1.substring(p1,p2);
					System.out.println("The Sub string is :"+s2);
					break;
			case 5:
				System.out.println("Enter the string");
				s1=in.next();
				System.out.println("Enter the charecter to replaced");
				s2=in.next();
				c1=s2.charAt(0);
				System.out.println("Enter the charecter to replace");
				s2=in.next();
				c2=s2.charAt(0);
				s2=s1.replace(c1, c2);
				System.out.println("THE STRING IS"+s2);
				break;
			case 6:
				System.out.println("Enter the first string");
				s1=in.next();
				System.out.println("enter the second string");
				s2=in.next();
				if(s1.equals(s2)) {
					System.out.println("THE STRING ARE EQUAL");
				}
				else {
					System.out.println("THE STRING ARE NOT EQUAL");
				}
				break;
				
			}
		}
		while(ch<=6);

	}

}
