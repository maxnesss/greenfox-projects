package Sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testSumArray() {
        int[] listOfNmb = new int[]{2,3,4,5,6};
        Main main = new Main();
        assertEquals(20, main.sumArray(listOfNmb));
    }
}