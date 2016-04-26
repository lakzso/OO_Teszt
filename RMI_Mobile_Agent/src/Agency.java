
import java.rmi.*;

public interface Agency extends Remote {

    public Agent accept(Agent a) throws RemoteException;

}
