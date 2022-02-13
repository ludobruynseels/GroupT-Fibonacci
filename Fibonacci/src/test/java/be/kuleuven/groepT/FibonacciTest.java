package be.kuleuven.groepT;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void generate5() {
        Fibonacci f = new Fibonacci();
        int result = f.Generate(5);
        assertEquals(5, result);
    }

    @Test
    void generate50() {
        Fibonacci f = new Fibonacci();
        int result = f.Generate(45);
        assertEquals(1134903170, result);
    }
}