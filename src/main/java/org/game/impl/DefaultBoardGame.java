package org.game.impl;

import org.game.api.IBoardGame;

public class DefaultBoardGame extends DefaultGame implements IBoardGame {
    private final DefaultBoard board;

    public DefaultBoardGame(DefaultBoard board) {
        this.board = board;
    }

    @Override
    public DefaultBoard getBoard() {
        return board;
    }
}
