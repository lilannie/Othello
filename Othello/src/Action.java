
public class Action {
	private Pair outer;
	private Pair middle;
	private Pair insert;
	
	public Action(Pair outer, Pair middle, Pair insert) {
		this.outer = outer;
		this.middle = middle;
		this.insert = insert;
	}
	
	public void doAction(State state) {
		state.applyAction(this);
	}
}
