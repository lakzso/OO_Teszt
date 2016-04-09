import java.util.*;
import java.io.*;

public class A implements Serializable
{
public  transient int i = 222;
public	int j = 1;





















public Object writeReplace() throws ObjectStreamException {

	A xxx = new A();
	xxx.i = 767676;
	xxx.j = 85657346;
	return xxx;	
   }
}


