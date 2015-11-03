package game;

public interface IPlayerTurnOrderTracker {
    public IPlayer getCurrentPlayer();
    public IPlayer getNextPlayer();
}
