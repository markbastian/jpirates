package org.pirates2;

import java.util.LinkedList;
import java.util.List;

public class Hand {
    private final List<? extends Card> cards = new LinkedList<>();

    public Hand() {
    }

    public List<? extends Card> getCards() {
        return cards;
    }
}
