package p1;

import java.util.Scanner;

 class Student {
	
	
	int regno,m1,m2,m3,total;
	float perecentage;
	void getdata() {
		String  name result  ;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name of student");
		name=in.next();
		System.out.println("enter register no. of student");
		regno=in.nextInt();
		System.out.println("enter marks of 1st subject");
		m1=in.nextInt();
		System.out.println("enter marks of 2nd subject");
		m2=in.nextInt();
		System.out.println("enter marks of 3rd subject");
		m3=in.nextInt();
		
	}
	void calculation() {
		total=m1+m2+m3;
		perecentage=(total)/3;
		if(m1>49 && m2>49 && m3>49) {
		name="pass";
		}
		else {
			name="fail";
		}
		
	}
	void show() {
		System.out.println("/t/t/tStudent Details");
		System.out.println("Name="+name);
		System.out.println("Regno="+regno);
		System.out.println("marks of first subject"+m1);
		System.out.println("marks of second subject"+m2);
		System.out.println("marks of thread subject"+m3);
		System.out.println(" total marks"+total);
		System.out.println("Result" +name);
		System.out.println("marks of first sub"+perecentage+"%");
	}
}

class UsingClassesAndObjects{
	public static void main(String args[]) {
		Student s = new Student();
		System.out.println("/t/t/t  student information system");
		s.getdata();
		s.calculation();
		s.show();
	}
}

