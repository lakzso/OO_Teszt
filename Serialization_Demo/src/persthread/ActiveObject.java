import java.io.Serializable;
import java.io.*;
public class ActiveObject implements  Serializable, Runnable {
transient private Thread active;
private int time;
private boolean b;
private String duma;	
public ActiveObject(String s, int delay) {
  this.time = delay; this.duma = s;
  startObject();
  }
  public void run() {
 		b = true;
		while (b) {
			System.out.println(duma);
			try { active.sleep(time); }
			catch (InterruptedException e){ return;}
			}
  }
  public void mystop() {
	b = false;
  }
  private void startObject() {
     active = new Thread(this);
     active.start();
   }
   private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
      in.defaultReadObject(); duma = "sdfsdf";
      startObject();
   }
   
}

