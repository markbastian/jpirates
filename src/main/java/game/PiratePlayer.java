package game;

import java.awt.*;

public class PiratePlayer extends DefaultPlayer {
    private final PirateHand hand = new PirateHand();

    public PiratePlayer(String name, Color color) {
        super(name, color);
    }

    public PirateHand getHand() {
        return hand;
    }
}
