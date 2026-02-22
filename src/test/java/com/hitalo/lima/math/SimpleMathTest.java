package com.hitalo.lima.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test math operations in SimpleMath Class")
public class SimpleMathTest {

    SimpleMath math;

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoAddedByTwo_ShouldReturnEightDotTwo() {
        // Given/Arrange
        Double firstNumber = 6.2D;
        Double secondNumber = 2D;
        Double expected = 8.2D;
        // When/Act
        Double actual = math.sum(firstNumber, secondNumber);

        // Then/Assert
        assertEquals(expected, actual, () -> firstNumber + " + " + secondNumber + " didn't produced " + expected);
    }

    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")

    void testSubtraction() {
        Double firstNumber = 6.2D;
        Double secondNumber = 2D;
        Double expected = 4.2D;
        Double actual = math.subtraction(firstNumber, secondNumber);

        assertEquals(expected, actual, () -> firstNumber + " - " + secondNumber + " didn't produced " + expected);
    }

    @Test
    @DisplayName("Test 6.2 * 2 = 12.4")

    void testMultiplication() {
        Double firstNumber = 6.2D;
        Double secondNumber = 2D;
        Double expected = 12.4D;
        Double actual = math.multiplication(firstNumber, secondNumber);

        assertEquals(expected, actual, () -> firstNumber + " * " + secondNumber + " didn't produced " + expected);
    }

    @Test
    @DisplayName("Test 6.2 / 2 = 3.1")

    void testDivision() {
        Double firstNumber = 6.2D;
        Double secondNumber = 2D;
        Double expected = 3.1D;
        Double actual = math.division(firstNumber, secondNumber);

        assertEquals(expected, actual, () -> firstNumber + " / " + secondNumber + " didn't produced " + expected);
    }

    @Test
    @DisplayName("Test (6.2 + 2)/2 = 4.1")

    void testMean() {
        Double firstNumber = 6.2D;
        Double secondNumber = 2D;
        Double expected = 4.1D;
        Double actual = math.mean(firstNumber, secondNumber);

        assertEquals(expected, actual,
                () -> "(" + firstNumber + " + " + secondNumber + ")/2 didn't produced " + expected);
    }

    @Test
    @DisplayName("Test sqrt(9) = 3")
    void testSquareRoot() {
        Double number = 9D;
        Double expected = 3D;
        Double actual = math.squareRoot(number);

        assertEquals(expected, actual, () -> "sqrt(" + number + ") didn't produced " + expected);
    }

    @Test
    @Disabled("TODO: We still need to work on it")
    @DisplayName("Test division by zero")
    void testDivision_When_FirstNumberIdDividedByZero_ShouldThrowArithmeticException() {
        fail();
    }

}
