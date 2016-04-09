package serenum;
import java.util.*;
import java.io.*;


public class A implements Serializable
{
	public enum Season {WINTER, SPRING, SUMMER, FALL}

	private Season  s;

	public int i;
	public void sets(Season _s) { s = _s; }
	public Season gets() { return s; }
	
}
