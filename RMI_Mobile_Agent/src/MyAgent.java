
public class MyAgent implements Agent {
    Integer i;

    public void run() {
	System.out.println(i);
	i++;
	System.out.println(i);
    }

    public void foo() {
	i = 1;
    }

    public void bar() {
	System.out.println(i);
    }
}
