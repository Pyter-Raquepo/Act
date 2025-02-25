package org.example;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Simple Calculator!");
        System.out.println("1. Addition (+)\n2. Subtraction (-)\n3. Multiplication (×)\n4. Division (÷)");
        System.out.print("Enter your choice (1-4): ");

        int operationChoice = scanner.nextInt();
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        double result;
        switch (operationChoice) {
            case 1: result = firstNumber + secondNumber; System.out.println("Result: " + result); break;
            case 2: result = firstNumber - secondNumber; System.out.println("Result: " + result); break;
            case 3: result = firstNumber * secondNumber; System.out.println("Result: " + result); break;
            case 4:
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default: System.out.println("Invalid choice. Select 1-4.");
        }
        scanner.close();
    }
}
