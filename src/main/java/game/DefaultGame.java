package game;

import java.util.LinkedList;
import java.util.List;

public class DefaultGame implements IGame {
    private final List<DefaultPlayer> players = new LinkedList<>();
    private final IPlayerTurnOrderTracker playerTurnOrderTracker;

    public List<DefaultPlayer> getPlayers() {
        return players;
    }

    public DefaultGame(IPlayerTurnOrderTracker playerTurnOrderTracker) {
        this.playerTurnOrderTracker = playerTurnOrderTracker;
    }

    @Override
    public IPlayerTurnOrderTracker getPlayerTurnOrderTracker() {
        return playerTurnOrderTracker;
    }
}
