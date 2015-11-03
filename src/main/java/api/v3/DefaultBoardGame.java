package api.v3;

public class DefaultBoardGame extends DefaultGame implements IBoardGame {
    private IBoard board = new DefaultBoard();

    @Override
    public IBoard getBoard() {
        return board;
    }

    public void setBoard(IBoard board) {
        this.board = board;
    }
}
