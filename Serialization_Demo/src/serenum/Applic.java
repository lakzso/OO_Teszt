package serenum;
import java.util.*;
import java.io.*;


public class Applic
{
	private String dbName = "x.odb";
	private A a, b;

	public void x() {
		A a = new A();
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(dbName));
			a.i = 21;
			a.sets(A.Season.FALL);
			out.writeObject(a);
			out.close();
		}
		catch(Exception e) {e.printStackTrace(); }	
		try {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(dbName));
		b = (A)in.readObject();
		}
		catch(Exception e) {e.printStackTrace(); }
		
		System.out.println("c: "+ b.gets());	
		System.out.println("i: "+ b.i);
	}

	public static void main(String[] args)
	{
		Applic app = new Applic();
		app.x();
	}

}
