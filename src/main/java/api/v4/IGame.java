package api.v4;

import java.util.Collection;

public interface IGame {
    Collection<? extends IPlayer> getPlayers();
    Collection<? extends IRule> getRules();
}
