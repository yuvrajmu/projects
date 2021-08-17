package p1;

public class addServerimpl extends linicastRemoteObject implements addserverintif {
	public addserverimpl() throws RemoteException { } 

public double add(double d1,double d2) throws RemoteException {
	return d1 +d2;
}
}

//addserverintf.java import java.rmi.*;
public interface addserverintf extends Remote {
	double add(double dl,double d2) throws RemoteException;
}
	
//addserver.java import java.net.*;
import java.rmi.*;
public class addserver { 
	public static void main(String args[]) {
		try {
			addserverimpl addserverimpl = new addserverimpl();
			Naming.rebind("addserver",addserverimpl);
			catch (Exception e) {
				System.out.println("exception: "+e); 
				} }} 
	
	//addclient.java import java.lang.*; 

	import java.rmi.*;
	public class addclient {
		public static void main(String args[]) {
			try { 
				String addServerURL = "rmi://localhost:1099/addserver";
				addserverintf addServerintf = (addserverintf)Naming.lookup(addServerURL);
				System.out.println("the sum is" + addServerintf.add(5,6)); }
			catch(Exception e) { 
				System.out.println("Exception " + e);
				}
			} 
		}
	}


