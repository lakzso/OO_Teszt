import java.util.*;
import java.io.*;

public class C extends B 
{
	private int ci;
	public int cj;

public void setci(int _i) {ci = _i; }

public int getci() { return ci;} 	

private void writeObject(ObjectOutputStream out) throws IOException
{
		System.out.println("SAJAT OUT");
	out.defaultWriteObject();
}


//private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
//{
//		System.out.println("SAJAT IN");
//	in.defaultReadObject();
//	// inicializálás
//}
	
	
}
