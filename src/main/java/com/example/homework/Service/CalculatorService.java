package com.example.homework.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int plus(Integer num1, Integer num2) {
        numNotNull(num1, num2);
        return num1 + num2;
    }

    public int minus(Integer num1, Integer num2) {
        numNotNull(num1, num2);
        return num1 - num2;
    }

    public int multiply(Integer num1, Integer num2) {
        numNotNull(num1, num2);
        return num1 * num2;
    }

    public int divide(Integer num1, Integer num2) throws IllegalArgumentException {
        numNotNull(num1, num2);
        if (num2 == 0) {
            throw new IllegalArgumentException("на 0 делить нельзя");
        }
        return num1 / num2;
    }

    public void numNotNull(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            System.out.println("данные отсутствуют");
        }
    }

}
