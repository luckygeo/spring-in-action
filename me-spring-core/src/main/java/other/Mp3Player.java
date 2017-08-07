package other;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created on 2017/8/6.
 */
//@Component("mp3")
//@Primary
public class Mp3Player implements CompactDisc {
    @Override
    public void play() {
        System.out.println("mp3 is playing...");
    }
}
