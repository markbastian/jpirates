package api.v3;

import java.util.Collection;

public interface IGame {
    Collection<? extends IPlayer> getPlayers();
    Collection<? extends IRule> getRules();
}
