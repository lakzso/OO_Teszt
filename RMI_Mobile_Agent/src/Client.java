import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class Client {
    static public void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry();
            Agency agency = (Agency)registry.lookup("agency");

	    MyAgent a = new MyAgent();

	    a.foo();
	    a = (MyAgent)agency.accept(a);
	    a.bar();

	    a = (MyAgent)agency.accept(a);
	    a.bar();

        } catch (Exception e) {
	    e.printStackTrace();
        }
    }
}

