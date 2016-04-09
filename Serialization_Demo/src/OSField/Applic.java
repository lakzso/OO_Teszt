package OSField;

import java.util.*;
import java.io.*;

public class Applic {
	private String dbName = "a.odb";
	A a = null;
	A b = null;

	public void initDB() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(dbName));
			b = (A) in.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void closeDB() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(dbName));
			out.writeObject(a);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Applic app = new Applic();
		app.go();
	}

	public void go() {

		a = new A();
		a.i = 5;
		a.j = 8;

		System.out.println("i= " + a.i);
		System.out.println("j= " + a.j);

		closeDB();

		initDB();
		System.out.println("i= " + b.i);
		System.out.println("j= " + b.j);
	}
}
