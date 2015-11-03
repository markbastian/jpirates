package game;

import java.util.List;

public interface IDeck {
    List<? extends ICard> getCards();
}
