package api.v3;

public class DefaultBoardGameWithCards extends DefaultBoardGame implements IBoardGameWithCards {
    private DefaultCardGame cardGame = new DefaultCardGame();

    @Override
    public IDeck getDeck() {
        return cardGame.getDeck();
    }
}
