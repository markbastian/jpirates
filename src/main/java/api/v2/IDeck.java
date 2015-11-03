package api.v2;

import java.util.Collection;

public interface IDeck {
    Collection<? extends ICard> getCards();
}
