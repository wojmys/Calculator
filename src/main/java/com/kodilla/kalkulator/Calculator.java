package com.kodilla.kalkulator;

public class Calculator {

    public double addition(double... value) {
        double result = 0;
        for (int i = 0; i < value.length; i++) {
            result += value[i];
        }
        return result;
    }

    public double subtraction(double... value) {
        double result = 0;
        for (int i = 0; i < value.length; i++) {
            result -= value[i];
        }
        return result;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.addition(1, 5, -0.5));
        System.out.println(calculator.subtraction(10, -0.2));

    }

}
