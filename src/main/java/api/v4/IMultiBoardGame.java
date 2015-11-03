package api.v4;

import java.util.Collection;

public interface IMultiBoardGame extends IGame {
    Collection<? extends IBoard> getBoards();
}
