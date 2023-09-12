package apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

    @Test
    void testGetApple() {
        Apples apple = new Apples();
        assertEquals("apple", apple.getApple());
    }
}