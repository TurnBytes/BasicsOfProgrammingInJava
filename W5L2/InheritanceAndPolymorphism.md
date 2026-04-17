# Inheritance and Polymorphism in Java

## Theoretical Background

Inheritance and polymorphism are fundamental concepts in object-oriented programming (OOP) that enable code reuse, extensibility, and flexibility.

### Inheritance
Inheritance is a mechanism where one class (subclass/child class) acquires the properties and behaviors of another class (superclass/parent class). It establishes an "is-a" relationship between classes.

Key points:
- The `extends` keyword is used to create a subclass.
- Subclasses inherit all non-private fields and methods from the superclass.
- Subclasses can add new fields and methods.
- Subclasses can override inherited methods to provide specific implementations.
- Access modifiers (`public`, `protected`, `private`) control inheritance visibility.

### Polymorphism
Polymorphism means "many forms" and allows objects of different classes to be treated as objects of a common superclass. It enables writing code that works with different types in a uniform way.

Key points:
- Achieved through method overriding (runtime polymorphism) and method overloading (compile-time polymorphism).
- Method overriding: Subclass provides a specific implementation of a method already defined in its superclass.
- The `@Override` annotation is used to indicate intentional overriding.
- Polymorphism enables dynamic method dispatch - the correct method is called based on the actual object type at runtime.

## Example

Consider the following code from `Person.java`:

```java
// Base class
public class Person {
    protected String name = "Kamal";
    protected String address;
    protected int age;

    public void work(String worktype) {
        System.out.println("I am working as " + worktype);
    }
}

// Subclass demonstrating inheritance
class Student extends Person {
    // Inherits name, address, age, and work() method

    // Method overriding - polymorphism
    @Override
    public void work(String worktype) {
        System.out.println("I am working as " + worktype);
    }

    public static void main(String[] args) {
        Student std = new Student();
        System.out.println(std.name);  // Accessing inherited field
        std.work("Student");           // Calling overridden method
    }
}
```

In this example:
- `Student` inherits from `Person`, gaining access to `name`, `address`, `age`, and the `work()` method.
- `Student` overrides the `work()` method to provide a specific implementation.
- The main method demonstrates accessing inherited members and polymorphic behavior.

## Benefits
- **Code Reuse**: Common functionality is defined once in the superclass.
- **Extensibility**: New subclasses can be added without modifying existing code.
- **Polymorphism**: Enables writing generic code that works with different object types.
- **Maintainability**: Changes to common behavior can be made in one place.

## Types of Inheritance in Java
- **Single Inheritance**: A class extends only one superclass (as shown in the example).
- **Multilevel Inheritance**: A class extends another class, which itself extends another class.
- **Hierarchical Inheritance**: Multiple classes extend the same superclass.

Note: Java doesn't support multiple inheritance with classes (a class can't extend multiple classes) but achieves it through interfaces.