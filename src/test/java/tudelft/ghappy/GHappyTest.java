package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void testSingleG() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("g");
        Assertions.assertEquals(false,result);

    }

    @Test
    public void testDoubleG() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("gg");
        Assertions.assertEquals(true,result);

    }

    @Test
    public void testTrippleG() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("ggg");
        Assertions.assertEquals(true,result);

    }

    @Test
    public void testGWithText() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("TextggTe");
        Assertions.assertEquals(true,result);

    }

    @Test
    public void testSingleGsWithText() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("gTextTeg");
        Assertions.assertEquals(false,result);

    }

    @Test
    public void testSingleAndDoubleGs() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("gTextggTeg");
        Assertions.assertEquals(false,result);

    }
}
