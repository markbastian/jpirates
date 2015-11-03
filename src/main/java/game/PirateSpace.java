package game;

import java.util.HashSet;
import java.util.Set;

public class PirateSpace {
    private final PirateSymbol symbol;
    private final Set<IPiece> pieces = new HashSet<>();

    public PirateSpace(PirateSymbol symbol) {
        this.symbol = symbol;
    }

    public PirateSymbol getSymbol() {
        return symbol;
    }

    public Set<IPiece> getPieces() {
        return pieces;
    }
}
