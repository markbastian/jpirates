package org.pirates2;

import org.game.api.IGame;
import org.game.impl.DefaultDeck;

import java.util.ArrayList;
import java.util.List;

public class Game implements IGame {
    private final List<Player> players = new ArrayList<>();
    private final Board board = new Board();
    private final DefaultDeck deck = new DefaultDeck();

    public Game() {
    }

    public List<Player> getPlayers() {
        return players;
    }

    public DefaultDeck getDeck() {
        return deck;
    }

    public Board getBoard() {

        return board;
    }
}
