package SourceBase.AllOperartions;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIst_Collection {

	public static void main(String[] args) {
		
		// Array list is a collection of hetirogenius elements so we can store int valus and string values also
		
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
