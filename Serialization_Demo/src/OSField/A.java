package OSField;

import java.io.ObjectStreamField;
import java.io.Serializable;

public class A implements Serializable {
	public transient int i = 222;
	public int j = 1;

	private static final ObjectStreamField[] serialPersistentFields = { new ObjectStreamField("i", Integer.TYPE) };
}
