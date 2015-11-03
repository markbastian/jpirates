package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PirateTrack {
    private final List<PirateSpace> spaces = new ArrayList<>();

    public PirateTrack() {
        for(PirateSymbol symbol : PirateSymbol.values())
            spaces.add(new PirateSpace(symbol));
        Collections.shuffle(spaces);
    }

    public List<PirateSpace> getSpaces() {
        return spaces;
    }
}
