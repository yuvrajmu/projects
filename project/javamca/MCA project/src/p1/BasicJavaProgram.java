package p1;

import java.util.Scanner;

public class BasicJavaProgram {

	public static void main(String[] args) {
		
		int a[]=new int[0];
		int i,n,x,flag;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=in.nextInt();
		System.out.println("Eneter elements");
		
		for(i=0;i<n;i++) {
			a[i]=in.nextInt();
			}
		System.out.println("Enter element to be search");
		x=in.nextInt();
		flag=0;
		for(i=0;i<=n;i++) {
			if(a[i]==x) {
				System.out.println("Element found at index position"+i);
				flag=1;
				break;
			}
			
		}
		if(flag==0) {
			System.out.println("Element not found");
			
		}

	}

}
