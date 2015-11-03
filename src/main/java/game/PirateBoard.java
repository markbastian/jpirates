package game;

import java.util.ArrayList;
import java.util.List;

public class PirateBoard extends DefaultBoard {
    private final List<PirateTrack> track = new ArrayList<>();

    public PirateBoard() {
        for(int i = 0; i < 6; i++){
            track.add(new PirateTrack());
        }
    }

    public List<PirateTrack> getTrack() {
        return track;
    }
}
