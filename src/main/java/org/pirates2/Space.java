package org.pirates2;

import org.game.api.IPiece;

import java.util.HashSet;
import java.util.Set;

public class Space {
    private final PirateSymbol symbol;
    private final Set<IPiece> pieces = new HashSet<>();

    public Space(PirateSymbol symbol) {
        this.symbol = symbol;
    }

    public PirateSymbol getSymbol() {
        return symbol;
    }

    public Set<IPiece> getPieces() {
        return pieces;
    }
}
