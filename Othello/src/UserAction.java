import java.util.ArrayList;

public class UserAction {
    private Pair insert;

    private ArrayList<Pair> flips;

    public UserAction (Pair insert) {
        this.insert = insert;
    }

    public void findFlips() {
        flips = new ArrayList<Pair>();
    }

    public void applyAction(State state) {
        Color[][] board = state.getBoard();

        for (Pair pair : flips) {
            Color old = board[pair.i][pair.j];
            board[pair.i][pair.j] = old.getFlip();
        }


    }

}
