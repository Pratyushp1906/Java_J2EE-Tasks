package java_Practice_Questions;

import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Handling ArithmeticException
        try {
            System.out.print("Enter a number to divide 10: ");
            int num = sc.nextInt();
            int result = 10 / num; // Division by zero will cause an exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        // Handling ArrayIndexOutOfBoundsException
        try {
            int[] numbers = new int[5];
            System.out.print("Enter an index to access in the array (0-4): ");
            int index = sc.nextInt();
            System.out.println("Array element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        // Handling multiple exceptions
        try {
            System.out.print("Enter a number to divide 50: ");
            int num = sc.nextInt();
            int result = 50 / num;
            System.out.println("Result: " + result);

            // Try accessing an invalid array index
            int[] numbers = new int[3];
            System.out.println("Array element at index 5: " + numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } finally {
            System.out.println("This block always executes.");
            sc.close();  // Closing the scanner to avoid resource leaks
        }
    }
}
