import java.util.*;
import java.io.*;


public class Applic
{
	private String dbName = "x";
	C bb = null;
	C bbb = null;

	public void initDB() {
		try {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(dbName));
		System.out.println("APPLIC IN");
		bbb = (C)in.readObject();
		}
		catch (Exception e) {e.printStackTrace(); }
	}

	void closeDB() {
		try {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(dbName));
		System.out.println("APPLIC OUT");
		out.writeObject(bb);
		out.close();
		}
		catch(Exception e) {e.printStackTrace(); }
	}

	public static void main(String[] args)
	{
		Applic app = new Applic();
		app.go();
	}

	public void go() {

		bb = new C();
		bb.cj = 11;
		bb.setci(22);		
		bb.bj = 5;
		bb.setbi(8);
		bb.aj = 44;
		bb.setai(64);

		System.out.println("cj= " + bb.cj);
		System.out.println("ci= " + bb.getci());
		System.out.println("bj= " + bb.bj);
		System.out.println("bi= " + bb.getbi());
		System.out.println("aj= " + bb.aj);
		System.out.println("ai= " + bb.getai());
			
		closeDB();
		
		initDB();
		System.out.println("cj= " + bbb.cj);
		System.out.println("ci= " + bbb.getci());
		System.out.println("bj= " + bbb.bj);
		System.out.println("bi= " + bbb.getbi());
		System.out.println("aj= " + bbb.aj);
		System.out.println("ai= " + bbb.getai());
		
	}
}
