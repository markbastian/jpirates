package org.game.impl;

import org.game.api.IPiece;

import java.awt.*;

public class DefaultPiece implements IPiece {
    private final Color color;

    public DefaultPiece(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
