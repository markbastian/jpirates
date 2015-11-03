package game;

import java.util.LinkedList;
import java.util.List;

public class PirateHand {
    private final List<? extends PirateCard> cards = new LinkedList<>();

    public PirateHand() {
    }

    public List<? extends PirateCard> getCards() {
        return cards;
    }
}
