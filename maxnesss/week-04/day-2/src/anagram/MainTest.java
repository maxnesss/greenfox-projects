package anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testisAnagram(){
        String text1 ="maxim";
        String text2 ="mixam";
        assertTrue(Main.isAnagram(text1, text2));

    }

}