package api.v2;

import java.util.Collection;
import java.util.LinkedList;

public class DefaultDeck implements IDeck {
    private final Collection<DefaultCard> cards = new LinkedList<>();

    @Override
    public Collection<DefaultCard> getCards() {
        return cards;
    }
}
