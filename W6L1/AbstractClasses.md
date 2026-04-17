# Abstract Classes in Java

## Theoretical Background

In object-oriented programming, abstraction is the process of hiding the implementation details and showing only the functionality to the user. In Java, abstraction can be achieved using abstract classes and interfaces.

An abstract class is a class that cannot be instantiated on its own and is designed to be subclassed. It can contain both abstract methods (methods without a body) and concrete methods (methods with implementation).

Key points:
- Abstract classes are declared using the `abstract` keyword.
- They can have abstract methods, which must be implemented by any concrete subclass.
- They can have concrete methods, fields, and constructors.
- Abstract classes can extend other classes and implement interfaces.
- A class that extends an abstract class must implement all its abstract methods, or it must be declared abstract itself.

## Example

Consider the following code from `Abstract.java`:

```java
abstract class Abstract {
    int xyz;
    final int z = 33;

    public abstract void work();

    public void sound() {
        System.out.println("Meo Meo");
    }
}

class Test extends Abstract {
    @Override
    public void work() {
        System.out.println("Working...");
    }
}
```

In this example, `Abstract` is an abstract class with:
- An instance variable `xyz`
- A final constant `z`
- An abstract method `work()` that must be implemented by subclasses
- A concrete method `sound()` that provides a default implementation

The class `Test` extends `Abstract` and provides an implementation for the abstract method `work()`.

Usage in `Main.java`:

```java
public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.work();  // Calls the implemented method in Test
        t.sound(); // Calls the inherited concrete method from Abstract
    }
}
```

This demonstrates how abstract classes allow for:
- Code reuse through inheritance
- Enforcement of certain behaviors in subclasses
- A mix of defined and undefined behaviors