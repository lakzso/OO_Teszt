package serinh;
import java.util.*;
import java.io.*;


public class Applic
{
	private String dbName = "x.odb";
	private B a, b;

	public void x() {
		B a = new B();
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(dbName));
			a.i = 8; 
			a.j = 5;
			a.k = 10;
			System.out.println("ai: "+ a.i);
			System.out.println("aj: "+ a.j);
			System.out.println("ak: "+ a.k);

			out.writeObject(a);
			out.close();
		}
		catch(Exception e) {e.printStackTrace(); }	
		try {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(dbName));
		b = (B)in.readObject();
		}
		catch(Exception e) {e.printStackTrace(); }
		
		System.out.println("i: "+ b.i);
		System.out.println("j: "+ b.j);
		System.out.println("k: "+ b.k);

	}

	public static void main(String[] args)
	{
		Applic app = new Applic();
		app.x();
	}

}
