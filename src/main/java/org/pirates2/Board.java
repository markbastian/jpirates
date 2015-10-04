package org.pirates2;

import org.game.impl.DefaultBoard;

import java.util.ArrayList;
import java.util.List;

public class Board extends DefaultBoard {
    private final List<Track> track = new ArrayList<>();

    public Board() {
        for(int i = 0; i < 6; i++){
            track.add(new Track());
        }
    }

    public List<Track> getTrack() {
        return track;
    }
}
