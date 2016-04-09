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
			a.seti(9);
			a.j = 3; a.k = 6;
			a.l = 2;
			out.writeObject(a);
			a.seti(4);
			a.j = 8; a.k = -2;
			a.l = 5;
			out.writeObject(a);
			out.close();
		}
		catch(Exception e) {e.printStackTrace(); }	
		try {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(dbName));
		b = (A)in.readObject();
		}
		catch(Exception e) {e.printStackTrace(); }
		
		System.out.println("i: "+ b.geti());
		System.out.println("j: "+ b.j);
		System.out.println("k: "+ b.k);
		System.out.println("l: "+ b.l);
	

	}

	public static void main(String[] args)
	{
		Applic app = new Applic();
		app.x();
	}

}
