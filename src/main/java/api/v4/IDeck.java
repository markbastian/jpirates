package api.v4;

import java.util.Collection;

public interface IDeck {
    Collection<? extends ICard> getCards();
}
