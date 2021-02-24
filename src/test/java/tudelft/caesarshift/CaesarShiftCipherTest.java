package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void shiftCharGreaterthan26(){
        CaesarShiftCipher str1= new CaesarShiftCipher();
        String result= str1.CaesarShiftCipher("abc",25);
        Assertions.assertEquals("zab",result);
    }
    @Test
    public void shiftCharLessthan26(){
        CaesarShiftCipher str1= new CaesarShiftCipher();
        String result= str1.CaesarShiftCipher("abc",5);
        Assertions.assertEquals("fgh",result);
    }
    @Test
    public void shiftCharlessthan0(){
        CaesarShiftCipher str1= new CaesarShiftCipher();
        String result= str1.CaesarShiftCipher("abc",-2);
        Assertions.assertEquals("yza",result);
    }

}
