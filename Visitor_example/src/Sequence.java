
public class Sequence implements Visitor {
	Visitor first, then;

	public Sequence(Visitor _first, Visitor _then) {
		first = _first;
		then = _then;
	}

	@Override
	public void visit_leaf(Leaf leaf) {
		leaf.accept(first);
		leaf.accept(then);
	}

	@Override
	public void visit_fork(Fork fork) {
		fork.accept(first);
		fork.accept(then);

	}

}
