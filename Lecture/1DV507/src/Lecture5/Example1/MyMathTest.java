package Lecture5.Example1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void mult() throws IllegalAccessException {
        // Test extreme cases
        assertEquals(0, MyMath.mult(10, 0)); // check 10*0 = 0
        assertEquals(10, MyMath.mult(10, 1));
        assertEquals(0, MyMath.mult(0, 10));

        // Test a few standard cases, provide
        assertEquals(50, MyMath.mult(10, 5), "10 x 5 = 50");
        assertEquals(-35, MyMath.mult(-7, 5), "-7 x 5 = -35");

        // Test with large numbers, check 23246 * 7958 = 184991668
        assertEquals(184991668, MyMath.mult(23246, 7958));

        // Check for IllegalArgumentException
        assertEquals(-10,MyMath.mult(10, -1));
        assertThrows(IllegalArgumentException.class, () -> MyMath.mult(10, -1));
    }
}