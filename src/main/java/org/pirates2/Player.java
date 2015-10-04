package org.pirates2;

import org.game.impl.DefaultPlayer;

import java.awt.*;

public class Player extends DefaultPlayer {
    private final Hand hand = new Hand();

    public Player(String name, Color color) {
        super(name, color);
    }

    public Hand getHand() {
        return hand;
    }
}
