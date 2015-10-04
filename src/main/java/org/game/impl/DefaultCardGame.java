package org.game.impl;


import org.game.api.ICardGame;

public class DefaultCardGame extends DefaultGame implements ICardGame {
    private final DefaultDeck deck = new DefaultDeck();

    @Override
    public DefaultDeck getDeck() {
        return deck;
    }
}
