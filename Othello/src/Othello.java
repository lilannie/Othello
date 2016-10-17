import java.util.List;
import java.util.Scanner;

public class Othello implements Game {
	private final static int numPlayers = 2;
	private static Player[] players;
	private State current;

	public static void main(String[] args)  {
		Othello game = new Othello();
		game.run();
	}

	public Othello() {
		players = getPlayers();
		current = getInitialState();
	}

	public void run(){
		boolean init = true;
		System.out.println("Welcome to Othello!");
		current.printBoard();
		System.out.println("Where would you like to move?");
		System.out.println("Input format: x y");

		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			if (!init)
				current.printBoard();
			else
				init = false;

			String input = scan.nextLine().trim();
			Scanner scanString = new Scanner(input);

			int x = scanString.nextInt();
			int y = scanString.nextInt();
			System.out.println("Your move: ("+ x + ", "+y+")");

			move(x, y);
		}
		scan.close();
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

	public void move(int x, int y) {
		//
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
