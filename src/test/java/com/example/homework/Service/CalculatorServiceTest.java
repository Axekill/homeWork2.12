package com.example.homework.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plusTest() {
        Integer result = calculatorService.plus(1, 8);
        Integer result1 = calculatorService.plus(null, 8);
        Assertions.assertNotNull(result);
        Assertions.assertNotNull(result1);
    }

    @Test
    public void minusTest() {
        Integer result = calculatorService.minus(4, 2);
        Integer result1 = calculatorService.minus(null, 3);
        Assertions.assertNotNull(result);
        Assertions.assertNotNull(result1);
    }

    @Test
    public void multiplyTest() {
        Integer result = calculatorService.multiply(2, 7);
        Integer result1 = calculatorService.multiply(5, null);
        Assertions.assertNotNull(result);
        Assertions.assertNotNull(result1);
    }

    @Test
    public void divideTest() {
        Integer result = calculatorService.divide(10, 5);
        Integer result1 = calculatorService.divide(35, 5);
        Assertions.assertNotNull(result);
        Assertions.assertNotNull(result1);
        Assertions.assertThrows(IllegalArgumentException.class,
                ()->calculatorService.divide(45,0));
    }


}
