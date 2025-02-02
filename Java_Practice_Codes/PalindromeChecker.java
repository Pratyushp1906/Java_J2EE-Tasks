package java_Practice_Questions;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Checking if the string is a palindrome
        boolean isPalindrome = isPalindrome(input);

        // Displaying the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Calculating factorial
        long factorial = calculateFactorial(number);

        // Displaying the factorial
        System.out.println("The factorial of " + number + " is: " + factorial);

        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
