package api.v4;

public class DefaultCardGameWithABoard extends DefaultCardGame implements ICardGameWithABoard {
    private DefaultBoardGame boardGame = new DefaultBoardGame();

    @Override
    public IBoard getBoard() {
        return boardGame.getBoard();
    }
}
