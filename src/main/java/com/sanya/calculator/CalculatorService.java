package com.sanya.calculator;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

@Service
public class CalculatorService {

    public long calculate(int operation, int number1, int number2)  {

        long result = 0;
        switch (operation) {
            case 1:  operation = 1;
                result = number1 + number2;
                break;
            case 2:  operation = 2;
                result = number1 - number2;
                break;
            case 3:  operation = 3;
                result = number1 * number2;
                break;
            case 4:  operation = 4;
                result = number1 / number2;
                break;
        }
        return result;

       /* if(operation == 1) {
            System.out.println("Result is: " + (number1 + number2));
        }
        if(operation == 2) {
            System.out.println("Result is: " + (number1 - number2));
        }
        if(operation == 3) {
            System.out.println("Result is: " + (number1 * number2));
        }
        if(operation == 4) {
            System.out.println("Result is: " + (number1 / number2));
        }*/
    }
}