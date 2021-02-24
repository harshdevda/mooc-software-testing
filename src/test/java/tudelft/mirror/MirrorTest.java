package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {
    @Test
    public void evenString(){
        Mirror m= new Mirror();
        String result = m.mirrorEnds("abccba");
        Assertions.assertEquals("abc",result);

    }
    @Test
    public void oddString(){
        Mirror m= new Mirror();
        String result = m.mirrorEnds("abcdcba");
        Assertions.assertEquals("abc",result);
    }
}
