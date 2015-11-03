package api.v1;

public class DefaultPlayer implements IPlayer {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DefaultPlayer(String name) {
        this.name = name;
    }

    public DefaultPlayer() {
    }
}
