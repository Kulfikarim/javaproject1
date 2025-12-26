package com.corejava;

import java.util.Scanner;

public class Maddy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input two numbers
            System.out.print("Enter first number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                return;
            }
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                return;
            }
            double num2 = scanner.nextDouble();

            // Perform arithmetic operations
            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;

            // Handle division and modulus safely
            if (num2 != 0) {
                double quotient = num1 / num2;
                double remainder = num1 % num2;
                System.out.println("\nResults:");
                System.out.println("Addition: " + sum);
                System.out.println("Subtraction: " + difference);
                System.out.println("Multiplication: " + product);
                System.out.println("Division: " + quotient);
                System.out.println("Modulus: " + remainder);
            } else {
                System.out.println("\nResults:");
                System.out.println("Addition: " + sum);
                System.out.println("Subtraction: " + difference);
                System.out.println("Multiplication: " + product);
                System.out.println("Division: Undefined (division by zero)");
                System.out.println("Modulus: Undefined (division by zero)");
            }

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

