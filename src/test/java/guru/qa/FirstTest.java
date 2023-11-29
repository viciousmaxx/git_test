package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    void firstTest() {
        Assertions.assertFalse(2>3);
    }

    @Test
    void secondTest() {
        Assertions.assertTrue(3>1);
    }

}
