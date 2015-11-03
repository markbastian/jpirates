package game;

public class PirateGame extends DefaultBoardGame {
    private final DefaultDeck deck = new DefaultDeck();

    public PirateGame(IPlayerTurnOrderTracker playerTurnOrderTracker, PirateBoard board) {
        super(playerTurnOrderTracker, board);
    }

    public DefaultDeck getDeck() {
        return deck;
    }
}
