package ru.job4j.calculator;

public class Calculator {

    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return add(first, add(second,third));
    }

    public double subtrackt(double first, double second) {
        return first - second;
    }

    public  double divide(double first, double second) {
        return first / second;
    }

    public double multiply(double first, double second) {
        return first * second;
    }

}