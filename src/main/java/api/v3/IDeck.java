package api.v3;

import java.util.Collection;

public interface IDeck {
    Collection<? extends ICard> getCards();
}
