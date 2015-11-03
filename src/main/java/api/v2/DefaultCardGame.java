package api.v2;

public class DefaultCardGame extends DefaultGame implements ICardGame {
    private final DefaultDeck deck = new DefaultDeck();

    public DefaultDeck getDeck() {
        return deck;
    }
}
