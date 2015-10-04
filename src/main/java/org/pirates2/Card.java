package org.pirates2;

import org.game.impl.DefaultCard;

public class Card extends DefaultCard {
    public Card(PirateSymbol symbol) {
        super(symbol);
    }

    public PirateSymbol getSymbol() {
        return (PirateSymbol) getInformation();
    }
}
