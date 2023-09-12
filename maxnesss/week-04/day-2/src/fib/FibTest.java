package fib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibTest {

    @Test
    void fib() {
        Fib fib = new Fib();
        assertEquals(5,fib.fib(5));
    }
}