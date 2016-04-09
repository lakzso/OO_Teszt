import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Derived extends Base implements Serializable {

	public static void main(String[] args) {
		Derived derived1 = new Derived();
		derived1.code = 88;

		try {
			FileOutputStream fos = new FileOutputStream("data.txt");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(derived1);
			os.close();
			FileInputStream fis = new FileInputStream("data.txt");
			ObjectInputStream is = new ObjectInputStream(fis);
			Derived derived2 = (Derived) is.readObject();
			System.out.print(derived2.code);
			is.close();
		} catch (Exception x) {
		}

	}

}
   