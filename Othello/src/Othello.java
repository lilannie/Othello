import java.util.List;

public class Othello implements Game {
	private final static int numPlayers = 2;
	private static Player[] players;
	private State current;
	
	public static void main(String[] args)  {
		
	}

	public Othello() {
		players = getPlayers();
		current = getInitialState();
	}
	
	@Override
	public State getInitialState() {
		return new State(players[0]);
	}

	@Override
	public Player[] getPlayers() {
		Player[] players = new Player[numPlayers];
		for (int i = 0; i < numPlayers; i++) {
			if (i % 2 == 0) 
				players[i] = new Player(Color.WHITE, false);
			else 
				players[i] = new Player(Color.BLACK, false);
		}
		if (numPlayers != 0) 
			players[0].setTurn(true);
		
		return players;
	}

	public Player getPlayer(State state) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Action> getActions(State state) {
		return state.getActions();
	}

	public State getResult(State state, Action action) {
		return state.applyAction(action);
	}

	public boolean isTerminal(State state) {
		return ((State) state).gameOver();
	}

	@Override
	public double getUtility(Object state, Object player) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getPlayer(Object state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getActions(Object state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getResult(Object state, Object action) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isTerminal(Object state) {
		// TODO Auto-generated method stub
		return false;
	}

}
