package ser;
import java.util.*;
import java.io.*;


public class A implements Serializable
{ 	private int i = 1;
	public int j = 2;
	public transient int k = 3;
	public static int l = 4;
	public void seti(int _i) { i = _i; }
	public int geti() { return i; }	
}
