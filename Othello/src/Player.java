
public class Player {
	private Color color;
	private boolean turn;
	
	public Player(Color color, boolean turn) {
		this.color = color;
		this.turn = turn;
	}
	
	public void setTurn(boolean turn) {
		this.turn = turn;
	}
}
