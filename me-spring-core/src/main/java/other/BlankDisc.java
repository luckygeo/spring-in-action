package other;

import java.util.List;

/**
 * Created on 2017/8/6.
 */
public class BlankDisc implements CompactDisc {
    public BlankDisc() {
    }

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Palying " + title + " by " + artist);
        if (tracks != null)
            for (String track : tracks) {
                System.out.println("-Track: " + track);
            }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    private String title;

    private String artist;

    private List<String> tracks = null;

}

