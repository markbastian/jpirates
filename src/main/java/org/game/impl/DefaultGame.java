package org.game.impl;

import java.util.LinkedList;
import java.util.List;

public class DefaultGame {
    private final List<DefaultPlayer> players = new LinkedList<>();

    public List<DefaultPlayer> getPlayers() {
        return players;
    }
}
