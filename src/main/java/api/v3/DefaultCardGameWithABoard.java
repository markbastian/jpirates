package api.v3;

public class DefaultCardGameWithABoard extends DefaultCardGame implements ICardGameWithABoard {
    private DefaultBoardGame boardGame = new DefaultBoardGame();

    @Override
    public IBoard getBoard() {
        return boardGame.getBoard();
    }
}
