import java.util.ArrayList;
import java.util.List;

public class State {
	private final int startingCorner = 3;
	private final int boardSize = 8;
	private final int fullBoard = boardSize * boardSize;

	private Color[][] board = new Color[boardSize][boardSize];
	private int numPiecesDown = 0;
	
	private Player current = null;

	public State(Player current) {
		this.current = current;
		
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				board[i][j] = Color.NONE;
			}
		}
		board[startingCorner][startingCorner] = Color.BLACK;
		board[startingCorner][startingCorner + 1] = Color.WHITE;
		board[startingCorner + 1][startingCorner] = Color.WHITE;
		board[startingCorner + 1][startingCorner + 1] = Color.BLACK;
		numPiecesDown = 4;
	}

	public State applyAction(Action a) {
		return null;
	}

	public boolean gameOver() {
		return numPiecesDown >= fullBoard;
	}

	public List<Action> getActions() {
		return findActions();
	}

	private List<Action> findActions() {
		List<Action> actions = new ArrayList<Action>();
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				if (board[i][j] == Color.NONE) {
					checkDiagonal(i, j);
					checkVertical(i, j);
					checkHorizontal(i, j);
				}

			}
		}
		return actions;
	}

	private void checkDiagonal(int i, int j) {
		// Top Left
			
		// Top Right

		// Bot Left

		// Bot Right

	}

	private void checkHorizontal(int i, int j) {
		// Mid Left

		// Mid Right

	}

	private void checkVertical(int i, int j) {
		// Top

		// Bot

	}
	 
	private int findLongestSandwich(int i, boolean i_positive, boolean horizontal, int j, boolean j_positive, int length, boolean vertical) {
		if (i_positive) 
			i++;
		else if (!horizontal)
			i--;
		
		if (j_positive)
			j++;
		else if (!vertical)
			j--;
		
		
		
		return length;
	}

	private boolean isBlackSandwhich(Color outer, Color middle) {
		if (outer != Color.BLACK || middle != Color.WHITE) 
			return false;
		return true;
	}
	
	private boolean isWhiteSandwhich(Color outer, Color middle) {
		if (outer != Color.WHITE || middle != Color.BLACK) 
			return false;
		return true;
	}

}
