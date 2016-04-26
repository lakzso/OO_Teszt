
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class Server {
    static public void main(String[] args) {

	try {
	    HelloImpl hello_i = new HelloImpl();
//	    Hello stub = (Hello)UnicastRemoteObject.exportObject(hello_i,0);
	    Registry registry = LocateRegistry.getRegistry();
	    registry.rebind("hello", hello_i);


	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}

