package p1;

import java.io.*; 
class fcopy { 
	public static void main(String args[]) throws I0Exception {
		int i;
		FilelnputStream fin; 
		FileOutputStream fout;
		try {
			try { 
				fin = new FilelnputStream(args[0]);
				} 
			catch(FileNotFoundException e) {
				System.out.println("Input File Not Found");
				return;
				}
			try fout = new FileOutputStream(args[1]); 
					} 
		catch(FileNotFoundException e) {
			System.out.println("Error Opening Output File"); 
			return; 
}

} 
} catch(ArrayIndexOutOfBoundsException e) 

{ 
  
	System.out.println("Usage : lopyFile From To"); 
	return; }
try {
	do{
		i= fin.read();
		if(i != -1) fout.write(i);
	}While(i != -1); 
}
catch(IOException e) 
System.out.println("File Error");
fin.close();
fout.close();
} //run method java fcopy sourcefile copied file 
}



