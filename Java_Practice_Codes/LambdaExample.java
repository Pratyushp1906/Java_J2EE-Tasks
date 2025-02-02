package java_Practice_Questions;

@FunctionalInterface
interface Calculator {
    int add(int a, int b); // Abstract method to be implemented
}

@FunctionalInterface
interface Greet {
    void sayHello(String name); // Abstract method to be implemented
}

public class LambdaExample {
    public static void main(String[] args) {
        // Lambda expression to implement the Calculator interface
        Calculator addOperation = (a, b) -> a + b;

        // Using the add method from Calculator interface
        int result = addOperation.add(5, 10);
        System.out.println("Sum: " + result);

        // Lambda expression to implement the Greet interface
        Greet greetOperation = name -> System.out.println("Hello, " + name + "!");

        // Using the sayHello method from Greet interface
        greetOperation.sayHello("Pratyush");

        // Another example using a lambda expression with a thread
        Runnable task = () -> System.out.println("The task is running in a thread!");
        Thread thread = new Thread(task);
        thread.start();
    }
}
