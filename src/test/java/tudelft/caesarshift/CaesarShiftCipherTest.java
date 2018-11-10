package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {


    private CaesarShiftCipher caesarShiftCipher;

    @BeforeEach
    public void initialize() {
        this.caesarShiftCipher = new CaesarShiftCipher();
    }

    @Test
    public void singleCharacterAcrossEnd() {
        String result = caesarShiftCipher.CaesarShiftCipher("z", 3);
        Assertions.assertEquals("c", result);
    }

    @Test
    public void singleCharacterAcrossStart() {
        String result = caesarShiftCipher.CaesarShiftCipher("b", -5);
        Assertions.assertEquals("w", result);
    }

    @Test
    public void multipleCharacters() {
        String result = caesarShiftCipher.CaesarShiftCipher("test", 5);
        Assertions.assertEquals("yjxy", result);
    }

    @Test
    public void shiftZero() {
        String result = caesarShiftCipher.CaesarShiftCipher("test", 0);
        Assertions.assertEquals("test", result);
    }
}
