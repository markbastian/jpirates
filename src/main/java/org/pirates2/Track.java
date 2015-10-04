package org.pirates2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Track {
    private final List<Space> spaces = new ArrayList<>();

    public Track() {
        for(PirateSymbol symbol : PirateSymbol.values())
            spaces.add(new Space(symbol));
        Collections.shuffle(spaces);
    }

    public List<Space> getSpaces() {
        return spaces;
    }
}
