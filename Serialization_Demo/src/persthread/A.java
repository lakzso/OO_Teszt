package persthread;
import java.io.*;

public class A {
    public static void main(String[] args) {
		ActiveObject a = new ActiveObject(new String("DDDDDD"),50);

 		BufferedReader inp = new BufferedReader(
					new InputStreamReader( System.in ) );   
		String s = "";
		while ( s.compareTo("0") != 0 )
		{  	try{ s = inp.readLine(); }
			catch (java.io.IOException e){;	}
		}
                try {
	            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("filename"));
		     out.writeObject(a);
	             out.close();
                }
                catch(IOException ex) {;}
		a.mystop(); System.out.println("stop a");
		try { System.out.println("vissza b");
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("filename"));
			ActiveObject b = (ActiveObject)in.readObject();
			in.close();
			System.out.println("megvan b");
		}
		catch(IOException ex) { System.out.println("IOEX");}
		catch(ClassNotFoundException ex) { System.out.println("CNF"); }

		String s1 = "";
		while ( s1.compareTo("0") != 0 )
		{  	try{ s1 = inp.readLine(); }
			catch (java.io.IOException e){;	}
		}
		
   	        System.exit(0);
	}

}

