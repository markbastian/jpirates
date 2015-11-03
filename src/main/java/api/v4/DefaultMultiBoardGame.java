package api.v4;

import java.util.Collection;
import java.util.LinkedList;

public class DefaultMultiBoardGame extends DefaultGame implements IMultiBoardGame {
    private final Collection<DefaultBoard> boards = new LinkedList<>();

    @Override
    public Collection<DefaultBoard> getBoards() {
        return boards;
    }
}
