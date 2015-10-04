package org.game.impl;

import java.awt.*;

public class CardGamePlayer extends DefaultPlayer {
    private final DefaultHand hand = new DefaultHand();

    public CardGamePlayer(String name, Color color) {
        super(name, color);
    }
}
