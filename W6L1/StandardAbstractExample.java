// StandardAbstractExample.java
// This file provides a standard example of abstract classes in Java.
// Abstract classes are used when you want to share code among related classes
// while enforcing that certain methods are implemented by subclasses.

abstract class Animal {
    // Abstract method - must be implemented by subclasses
    public abstract void makeSound();

    // Concrete method - shared by all animals
    public void eat() {
        System.out.println("This animal is eating.");
    }

    // Concrete method with implementation
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Dog-specific method
    public void fetch() {
        System.out.println("Dog is fetching the ball.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    // Cat-specific method
    public void climb() {
        System.out.println("Cat is climbing the tree.");
    }
}

public class StandardAbstractExample {
    public static void main(String[] args) {
        // Cannot instantiate abstract class: Animal a = new Animal(); // Error!

        // Create instances of concrete subclasses
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Dog:");
        dog.makeSound();  // Implemented in Dog
        dog.eat();        // Inherited from Animal
        dog.sleep();      // Inherited from Animal
        dog.fetch();      // Dog-specific

        System.out.println("\nCat:");
        cat.makeSound();  // Implemented in Cat
        cat.eat();        // Inherited from Animal
        cat.sleep();      // Inherited from Animal
        cat.climb();      // Cat-specific

        // Polymorphism: Animal reference can point to any subclass
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        System.out.println("\nPolymorphism:");
        animal1.makeSound();  // Calls Dog's makeSound()
        animal2.makeSound();  // Calls Cat's makeSound()
    }
}