package org.game.api;

public interface PlayerTurnOrderTracker {
    public IPlayer getCurrentPlayer();
    public IPlayer getNextPlayer();
}
