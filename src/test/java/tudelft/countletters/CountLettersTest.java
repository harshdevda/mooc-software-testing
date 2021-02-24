package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }
    @Test
    public void endWithR(){
        int words = new CountLetters().count("fear|dog");
        Assertions.assertEquals(1,words);
    }
    @Test
    public void endWithRandS(){
        int words = new CountLetters().count("fear|dogs");
        Assertions.assertEquals(2,words);
    }
    @Test
    public void endWithXandR(){
        int words = new CountLetters().count("fox|fear");
        Assertions.assertEquals(1,words);

    }

}