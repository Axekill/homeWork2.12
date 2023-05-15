package com.example.homework.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceParameterizedTest {
    private final CalculatorService calculatorService=new CalculatorService();

    @ParameterizedTest
    @MethodSource("calculationTest")
    void calcTest(Integer num1,Integer num2){
        Integer result=calculatorService.plus(num1,num2);
        Assertions.assertNotNull(result);
        Integer result1=calculatorService.minus(num1,num2);
        Assertions.assertNotNull(result1);
        Integer result2=calculatorService.multiply(num1,num2);
        Assertions.assertNotNull(result2);
        Integer result3=calculatorService.divide(num1,num2);
        Assertions.assertNotNull(result3);
    }

    @Test
    public void notDivide() {
        Assertions.assertThrows(IllegalArgumentException.class,
                ()->calculatorService.divide(45,0));
    }


    public static Stream<Arguments> calculationTest(){
       return Stream.of(
               Arguments.of(6,3),
               Arguments.of(10,null),
               Arguments.of(8,0)

       ) ;
    }

}
