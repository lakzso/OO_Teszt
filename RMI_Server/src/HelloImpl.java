
import java.rmi.*;
import java.rmi.server.*;

public class HelloImpl extends UnicastRemoteObject implements Hello {

    public HelloImpl() throws RemoteException {
	super();
    }

    public void sayHello(String s) throws RemoteException {
	System.out.println(s);
    }
}
