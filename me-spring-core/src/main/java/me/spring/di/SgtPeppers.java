package me.spring.di;

import org.springframework.stereotype.Component;
import other.CompactDisc;

/**
 * Created on 2017/8/5
 */
/*@Component*/
public class SgtPeppers implements CompactDisc {

    private final String title = "Sgt. Pepper Lonely Hearts Clubs Band";

    private final String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Palying " + title + " by " + artist);
    }
}
