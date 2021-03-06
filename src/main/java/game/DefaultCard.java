package game;

public class DefaultCard<T> implements ICard {
    private final T information;

    public DefaultCard(T information) {
        this.information = information;
    }

    public T getInformation() {
        return information;
    }
}
