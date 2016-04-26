
import java.rmi.*;

public interface Hello extends Remote {

    public void sayHello(String s) throws RemoteException;

}
