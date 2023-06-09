package com.example.homework.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceParameterizedTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("calculationTest")
    void calcTest(Integer num1, Integer num2) {
        Integer result = calculatorService.plus(num1, num2);
        assertNotNull(result);
        int resultPlus=9;
        assertEquals(resultPlus, result);

        Integer result1 = calculatorService.minus(num1, num2);
        assertNotNull(result1);
        int resultMinus = 3;
        assertEquals(resultMinus,result1);

        Integer result2 = calculatorService.multiply(num1, num2);
        assertNotNull(result2);
        int resultMultiply = 18;
        assertEquals(resultMultiply,result2);

        Integer result3 = calculatorService.divide(num1, num2);
        assertNotNull(result3);
        int resultDivide = 2;
        assertEquals(resultDivide,result3);
    }

    @Test
    public void notDivide() {
        assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divide(45, 0));
    }


    public static Stream<Arguments> calculationTest() {
        return Stream.of(
                Arguments.of(6,3)
        );
    }

}
