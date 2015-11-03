package game;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DefaultDeck implements IDeck {
    private final List<DefaultCard> cards = new LinkedList<>();

    @Override
    public List<DefaultCard> getCards() {
        return cards;
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }
}
