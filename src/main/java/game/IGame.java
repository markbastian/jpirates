package game;

import java.util.List;

public interface IGame {
    List<? extends IPlayer> getPlayers();
    IPlayerTurnOrderTracker getPlayerTurnOrderTracker();
}
