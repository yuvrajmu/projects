package p1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IoStream {
	public static void main(String[] args) {
	try {
		
		InputStreamReader ir=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(ir);
	    System.out.println("Enter text: ");
	    String str = br.readLine(); 
	    System.out.println(" You entered String: ");
	    System.out.println(str);
	    String str1[]=new String[100];
	    System.out.println("Enter lines of text");
	    System.out.println("Enter 'end' to quit");
	    for(int i=0; i<100; i++)
	    {
	     str1[i]=br.readLine(); 
	     if(str1[i].equals("end"))  
	      break;
	    }

	    System.out.println("Here is your file:"); 
	    for(int i=0; i<100; i++)
	    	if(str1[i].equals("end")) 
	    		break;
	    System .out.println(str1[1]); 
	     }


	catch(Exception e) 
	{ 
	     System .out.println(e);
	}
	}
	}
