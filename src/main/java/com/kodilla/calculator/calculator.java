package com.kodilla.calculator;

public class calculator {
    public int add(int first, int second) {
        return first + second;
    }

    public int subtract(int first, int second) {
        return first - second;
    }

    public static void main(String[] args) {
        calculator calculator = new calculator();
        int sum = calculator.add(6, 6);
        int sub = calculator.subtract(10, 8);
        System.out.println("Add=:" + sum + "   " + "Sub:" + sub);

    }
}
