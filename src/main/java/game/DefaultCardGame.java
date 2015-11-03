package game;


public class DefaultCardGame extends DefaultGame implements ICardGame {
    private final DefaultDeck deck = new DefaultDeck();

    @Override
    public DefaultDeck getDeck() {
        return deck;
    }

    public DefaultCardGame(IPlayerTurnOrderTracker playerTurnOrderTracker) {
        super(playerTurnOrderTracker);
    }
}
