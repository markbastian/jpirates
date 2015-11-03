package game;

import java.awt.*;

public class DefaultCardGamePlayer extends DefaultPlayer {
    private final DefaultHand hand = new DefaultHand();

    public DefaultCardGamePlayer(String name, Color color) {
        super(name, color);
    }
}
