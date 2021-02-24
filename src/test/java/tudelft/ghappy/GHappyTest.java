package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest(name = "in={0}, exp={1}")
    @CsvSource({"g,false","x,true"})
    public void oneChar(String in,Boolean exp) {
        GHappy str = new GHappy();
        Boolean result = str.gHappy(in);
        Assertions.assertEquals(exp,result);
    }
    @ParameterizedTest(name = "in={0}, exp={1}")
    @CsvSource({"xx,true","gx,false","xg,false","gg,true"})
    public void twoChar(String in,Boolean exp){
        GHappy str = new GHappy();
        Boolean result = str.gHappy(in);
        Assertions.assertEquals(exp,result);
    }
    @ParameterizedTest(name = "in={0}, exp={1}")
    @CsvSource({"xgx,false","xxg,false","gxx,false","xgg,true","ggx,true","gxg,false","xxx,true","ggg,true"})
    public void threeChar(String in,Boolean exp){
        GHappy str = new GHappy();
        Boolean result = str.gHappy(in);
        Assertions.assertEquals(exp,result);
    }
    @ParameterizedTest
    @CsvSource({"xggx","xgxx","gxgg","gggg","xxxx"})
    public void fourChar(String in,Boolean exp){
        GHappy str = new GHappy();
        Boolean result = str.gHappy(in);
        Assertions.assertEquals(exp,result);
    }
}
