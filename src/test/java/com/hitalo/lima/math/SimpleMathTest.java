package com.hitalo.lima.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Test math operations in SimpleMath Class")
public class SimpleMathTest {

    SimpleMath math;

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]

    @ParameterizedTest(name = "sum({0}, {1}) = {2}")
    @CsvSource({
            "6.2, 2, 8.2",
            "0, 0, 0",
            "-3, 2, -1"
    })
    @DisplayName("Test sums")
    void testSum_When_ValuesProvided_ShouldReturnExpected(Double firstNumber, Double secondNumber, Double expected) {
        Double actual = math.sum(firstNumber, secondNumber);

        assertEquals(expected, actual, 0.0001,
                () -> firstNumber + " + " + secondNumber + " didn't produced " + expected);
    }

    @ParameterizedTest(name = "subtraction({0}, {1}) = {2}")
    @CsvSource({
            "6.2, 2, 4.2",
            "0, 0, 0",
            "-3, 2, -5"
    })
    @DisplayName("Test subtractions")
    void testSubtraction_When_ValuesProvided_ShouldReturnExpected(Double firstNumber, Double secondNumber,
            Double expected) {
        Double actual = math.subtraction(firstNumber, secondNumber);

        assertEquals(expected, actual, 0.0001,
                () -> firstNumber + " - " + secondNumber + " didn't produced " + expected);
    }

    @ParameterizedTest(name = "multiplication({0}, {1}) = {2}")
    @CsvSource({
            "6.2, 2, 12.4",
            "0, 5, 0",
            "-3, 2, -6"
    })
    @DisplayName("Test multiplications")
    void testMultiplication_When_ValuesProvided_ShouldReturnExpected(Double firstNumber, Double secondNumber,
            Double expected) {
        Double actual = math.multiplication(firstNumber, secondNumber);

        assertEquals(expected, actual, 0.0001,
                () -> firstNumber + " * " + secondNumber + " didn't produced " + expected);
    }

    @ParameterizedTest(name = "division({0}, {1}) = {2}")
    @CsvSource({
            "6.2, 2, 3.1",
            "0, 5, 0",
            "-6, 2, -3"
    })
    @DisplayName("Test divisions")
    void testDivision_When_ValuesProvided_ShouldReturnExpected(Double firstNumber, Double secondNumber,
            Double expected) {
        Double actual = math.division(firstNumber, secondNumber);

        assertEquals(expected, actual, 0.0001,
                () -> firstNumber + " / " + secondNumber + " didn't produced " + expected);
    }

    @ParameterizedTest(name = "mean({0}, {1}) = {2}")
    @CsvSource({
            "6.2, 2, 4.1",
            "0, 0, 0",
            "-2, 2, 0"
    })
    @DisplayName("Test means")
    void testMean_When_ValuesProvided_ShouldReturnExpected(Double firstNumber, Double secondNumber, Double expected) {
        Double actual = math.mean(firstNumber, secondNumber);

        assertEquals(expected, actual, 0.0001,
                () -> "(" + firstNumber + " + " + secondNumber + ")/2 didn't produced " + expected);
    }

    @ParameterizedTest(name = "sqrt({0}) = {1}")
    @CsvSource({
            "9, 3",
            "0, 0",
            "4, 2"
    })
    @DisplayName("Test square roots")
    void testSquareRoot_When_ValuesProvided_ShouldReturnExpected(Double number, Double expected) {
        Double actual = math.squareRoot(number);

        assertEquals(expected, actual, 0.0001, () -> "sqrt(" + number + ") didn't produced " + expected);
    }

    @Test
    @DisplayName("Test division by zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
        Double firstNumber = 6.2D;
        Double secondNumber = 0D;

        assertThrows(ArithmeticException.class, () -> math.division(firstNumber, secondNumber),
                () -> "Division by zero didn't throw ArithmeticException");
    }

}
