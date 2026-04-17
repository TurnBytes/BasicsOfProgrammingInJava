# Interfaces in Java

## Theoretical Background

Interfaces in Java are a fundamental way to achieve abstraction and support multiple inheritance. An interface is a reference type that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces define a contract that implementing classes must follow.

Key points:
- Interfaces are declared using the `interface` keyword.
- All methods in an interface are implicitly `public` and `abstract` (except default and static methods introduced in Java 8).
- Interfaces cannot be instantiated directly.
- A class implements an interface using the `implements` keyword.
- A class can implement multiple interfaces, enabling multiple inheritance of type.
- Interfaces can contain:
  - Constants (implicitly `public static final`)
  - Abstract methods (implicitly `public abstract`)
  - Default methods (with implementation, introduced in Java 8)
  - Static methods (introduced in Java 8)
  - Private methods (introduced in Java 9)

## Example

Consider the following code from `Vehicle.java`:

```java
interface Xyz {
    // An empty interface - can be used as a marker interface
}

interface Vehicle {
    public static final String CarModel = "BMW";  // Constant

    public abstract void steer();  // Abstract method
}

class Car implements Vehicle, Xyz {  // Multiple interface implementation
    @Override
    public void steer() {
        System.out.println("Steering the " + CarModel);
    }

    public static String Sensor() {
        Scanner sensor = new Scanner(System.in);
        System.out.println("Sensing...");
        String vehicle = sensor.next();
        return vehicle;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sensor = new Scanner(System.in);
        String vehicle = Car.Sensor();
        System.out.println(vehicle);
    }
}
```

In this example:
- `Vehicle` is an interface defining a contract with a constant `CarModel` and an abstract method `steer()`.
- `Xyz` is an empty interface, demonstrating marker interfaces.
- `Car` implements both `Vehicle` and `Xyz`, showing multiple inheritance through interfaces.
- `Car` provides a concrete implementation of the `steer()` method.
- The `Sensor()` method is a static method in `Car`, unrelated to the interface but demonstrating additional functionality.

This demonstrates how interfaces:
- Define contracts for behavior
- Enable multiple inheritance
- Allow for loose coupling between classes
- Support polymorphism
- Can include constants and utility methods