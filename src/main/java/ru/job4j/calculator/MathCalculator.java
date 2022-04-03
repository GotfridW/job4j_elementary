package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public  static  double diffAndDivision(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    public static double allMathOperations(double first, double second) {
        return sum(first, second) + division(first, second)
                + subtraction(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Calculation result is: " + sumAndMultiply(10, 20));
        System.out.println("Calculation result is: " + diffAndDivision(32, 16));
        System.out.println("Calculation result is: " + allMathOperations(15, 3));
    }

}
