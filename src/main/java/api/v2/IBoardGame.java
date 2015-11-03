package api.v2;

public interface IBoardGame<T> extends IGame {
    IBoard getBoard();
    IDice<T> getDice();
}
