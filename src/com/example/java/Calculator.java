package com.example.java;

import java.util.Scanner;

import static com.example.java.util.MathMethods.*;

public class Calculator {

    public static void main(String[] args) {
        String ss = getInput("Enter a numeric value: ");
        String s2 = getInput("Enter a numeric value: ");
        String op = getInput("Choose an operation (+ - * /):");

        double result;

        try {
            switch (op) {
                case "+":
                    result = addValues(ss, s2);
                    break;
                case "-":
                    result = subtractValues(ss, s2);
                    break;
                case "*":
                    result = multiplyValues(ss, s2);
                    break;
                case "/":
                    result = divideValues(ss, s2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }

            System.out.println("The answer is " + result);

        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
