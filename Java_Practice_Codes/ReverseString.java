package java_Practice_Questions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Reversing the string
        String reversed = reverseString(input);

        // Displaying the reversed string
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
