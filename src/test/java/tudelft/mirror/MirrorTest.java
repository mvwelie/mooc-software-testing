package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    private Mirror mirror;

    @BeforeEach
    public void initialize() {
        mirror = new Mirror();
    }
    @Test
    public void unevenInputLength() {
        String result = mirror.mirrorEnds("abXYZba");
        Assertions.assertEquals("ab", result);
    }

    @Test
    public void evenInputLength() {
        String result = mirror.mirrorEnds("abca");
        Assertions.assertEquals("a", result);
    }

    @Test
    public void unevenLengthOverlap() {
        String result = mirror.mirrorEnds("aba");
        Assertions.assertEquals("aba", result);
    }
}
