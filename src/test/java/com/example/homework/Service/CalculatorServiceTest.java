package com.example.homework.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plusTest() {
        Integer result = calculatorService.plus(1, 8);
        int resultPlus = 9;
        assertEquals(resultPlus, result);
        assertNotNull(result);
    }

    @Test
    public void minusTest() {
        Integer result = calculatorService.minus(4, 2);
        int resultMinus = 2;
        assertEquals(resultMinus, result);
        assertNotNull(result);
    }

    @Test
    public void multiplyTest() {
        Integer result = calculatorService.multiply(2, 7);
        int resultMultiply = 14;
        assertEquals(resultMultiply, result);
        assertNotNull(result);
    }

    @Test
    public void divideTest() {
        Integer result = calculatorService.divide(10, 5);
        int resultDivide = 2;
        assertEquals(resultDivide, result);
        assertNotNull(result);
        assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divide(45, 0));
    }


}
