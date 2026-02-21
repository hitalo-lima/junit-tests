package com.hitalo.lima.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SimpleMathTest {
    @Test
    void testSum() {
        SimpleMath math = new SimpleMath();

        Double firstNumber = 6.2D;
        Double secondNumber = 2D;
        Double expected = 8.2D;
        Double actual = math.sum(firstNumber, secondNumber);

        assertEquals(expected, actual, () -> firstNumber + " + " + secondNumber + " didn't produced " + expected);
        assertNotNull(actual);
    }
}
