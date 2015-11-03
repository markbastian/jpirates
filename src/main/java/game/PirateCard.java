package game;

public class PirateCard extends DefaultCard {
    public PirateCard(PirateSymbol symbol) {
        super(symbol);
    }

    public PirateSymbol getSymbol() {
        return (PirateSymbol) getInformation();
    }
}
