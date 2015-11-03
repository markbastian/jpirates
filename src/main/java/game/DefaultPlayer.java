package game;

import java.awt.*;

public class DefaultPlayer implements IPlayer {
    private final String name;
    private final Color color;

    public DefaultPlayer(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
