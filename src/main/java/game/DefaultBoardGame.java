package game;

public class DefaultBoardGame extends DefaultGame implements IBoardGame {
    private final DefaultBoard board;

    public DefaultBoardGame(IPlayerTurnOrderTracker playerTurnOrderTracker, DefaultBoard board) {
        super(playerTurnOrderTracker);
        this.board = board;
    }

    @Override
    public DefaultBoard getBoard() {
        return board;
    }
}
