
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class Server {
    static public void main(String[] args) {
	if (System.getSecurityManager() == null) {
     	    System.setSecurityManager(new SecurityManager());
	}
	try {
	    MyAgency mya = new MyAgency();
	    Agency stub = (Agency)UnicastRemoteObject.exportObject(mya,0);
	    Registry registry = LocateRegistry.getRegistry();
	    registry.rebind("agency", stub);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}

