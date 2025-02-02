package java_Practice_Questions;


class Animal {
    // Method in the parent class (base class)
    public void sound() {
        System.out.println("Animal makes a sound.");
    }

    // Method in the parent class
    public void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    // Method overriding in the Dog class
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }

    // Additional method specific to Dog class
    public void fetch() {
        System.out.println("Dog is fetching the ball.");
    }
}

class Cat extends Animal {
    // Method overriding in the Cat class
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }

    // Additional method specific to Cat class
    public void scratch() {
        System.out.println("Cat is scratching the furniture.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Creating objects of the derived classes
        Animal animal = new Animal();  // Base class object
        Animal dog = new Dog();        // Polymorphism: Base class reference, Dog object
        Animal cat = new Cat();        // Polymorphism: Base class reference, Cat object

        // Calling methods on objects
        System.out.println("Animal sound:");
        animal.sound();  // Calls Animal's sound()

        System.out.println("\nDog sound:");
        dog.sound();     // Calls Dog's overridden sound()

        System.out.println("\nCat sound:");
        cat.sound();     // Calls Cat's overridden sound()

        // Demonstrating additional methods in derived classes
        System.out.println("\nAdditional Dog behavior:");
        ((Dog) dog).fetch();  // Type casting to access Dog's specific method

        System.out.println("\nAdditional Cat behavior:");
        ((Cat) cat).scratch();  // Type casting to access Cat's specific method
    }
}

