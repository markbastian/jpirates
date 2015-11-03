package api.v1;

import java.util.Collection;
import java.util.LinkedList;

public class DefaultGame implements IGame {
    private final Collection<DefaultPlayer> players = new LinkedList<>();
    private final Collection<DefaultRule> rules = new LinkedList<>();

    @Override
    public Collection<DefaultPlayer> getPlayers() {
        return players;
    }

    @Override
    public Collection<DefaultRule> getRules() {
        return rules;
    }
}
