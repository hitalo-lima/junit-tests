package com.hitalo.lima.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SimpleMathTest {
    @Test
    void testSum() {
        SimpleMath math = new SimpleMath();

        Double expected = 8.2D;
        Double actual = math.sum(6.2D, 2D);

        assertEquals(expected, actual);
    }
}
