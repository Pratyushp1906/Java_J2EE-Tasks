package java_Practice_Questions;

import java.util.Scanner;

public class RecursionExample {

    // Recursive method to compute factorial
    public static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive call
        return n * factorial(n - 1);
    }

    // Recursive method to compute Fibonacci sequence
    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // Recursive call
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Factorial Example
        System.out.print("Enter a number to compute its factorial: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is: " + factorial(num));

        // Fibonacci Example
        System.out.print("Enter a number to compute its Fibonacci value: ");
        int fibNum = sc.nextInt();
        System.out.println("Fibonacci number at position " + fibNum + " is: " + fibonacci(fibNum));

        sc.close();
   
}
}