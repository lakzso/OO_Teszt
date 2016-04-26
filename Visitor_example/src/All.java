
public class All implements Visitor{
  Visitor v;
    public All(Visitor _v){
    	v=_v;
    }
	@Override
	public void visit_leaf(Leaf leaf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit_fork(Fork fork) {
		fork.left.accept(v);
		fork.right.accept(v);
		
	}

}
