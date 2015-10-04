package org.game.api;

import java.util.List;

public interface IDeck {
    List<? extends ICard> getCards();
}
