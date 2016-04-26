
import java.rmi.*;

public class MyAgency implements Agency {

    public Agent accept(Agent a) throws RemoteException {
	System.out.println("Accepting agent");
	a.run();
	System.out.println("Done.");
	return a;
    }

}
