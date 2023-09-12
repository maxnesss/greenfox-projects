import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {


    @BeforeEach
    void init (){
        Sum sum = new Sum();
    }
   @AfterEach
   void clen(){
       System.out.println("cleaning");
   }
    @Test
    void sumTwoNmb(int a,int b) {


        assertEquals(5,a+b);
    }
}