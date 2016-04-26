
public class Fork extends Node{
    Node left,right;
    public void accept(Visitor v){
    	v.visit_fork(this);
    }
}
