package api.v2;

import java.util.Collection;

public interface IDice<T> {
    Collection<IDie<T>> getDice();
}
