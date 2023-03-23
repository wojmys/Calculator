package com.kodilla.kalkulator;

public class Calculator {
    public static void main(String[] args) {


        System.out.println(addition(0.1,-2,3));
        System.out.println(subtraction(5,3,-0.5));

    }

    static double addition(double...value){
        double result=0;
        for (int i=0;i<value.length;i++){
            result+=value[i];
        }
        return result;
    }
    static double subtraction(double...value){
        double result=0;
        for (int i=0;i<value.length;i++){
            result-=value[i];
        }
        return result;
    }


}
