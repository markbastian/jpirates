package org.game.api;

import java.util.List;

public interface IGame {
    List<? extends IPlayer> getPlayers();
}
