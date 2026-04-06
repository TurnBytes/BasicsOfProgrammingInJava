# Java Keywords in Object-Oriented Programming

This document covers essential Java keywords used in object-oriented programming, including `static`, `super`, `final`, `abstract`, `this`, and others. Each keyword is explained with its purpose, use cases, benefits, and code examples.

## 1. `static` Keyword

### What is `static`?
The `static` keyword in Java is used to create class-level members that belong to the class rather than any specific instance of the class. Static members are shared among all instances of the class.

### Why use `static`?
- To create utility methods or constants that don't need an object instance
- To maintain shared state across all instances
- To save memory by avoiding duplicate copies in each object

### Where it can be used:
- **Variables**: Class variables (static fields)
- **Methods**: Class methods
- **Blocks**: Static initialization blocks
- **Inner Classes**: Static nested classes

### Use Cases:
- Constants (e.g., `Math.PI`)
- Utility methods (e.g., `Math.max()`)
- Factory methods
- Singleton patterns
- Counters shared across instances

### Benefits:
- Memory efficiency (no per-instance storage)
- Direct access without object creation
- Thread-safe for immutable static data
- Better performance for frequently used utilities

### Code Examples:

#### Static Variable (Counter)
```java
public class Student {
    private static int totalStudents = 0;  // Shared counter
    private String name;
    
    public Student(String name) {
        this.name = name;
        totalStudents++;  // Increments for every instance
    }
    
    public static int getTotalStudents() {
        return totalStudents;  // Can access without instance
    }
}

// Usage
Student s1 = new Student("Alice");
Student s2 = new Student("Bob");
System.out.println(Student.getTotalStudents());  // Output: 2
```

#### Static Method (Utility)
```java
public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

// Usage - no object needed
int sum = Calculator.add(5, 3);  // 8
double area = Calculator.calculateArea(5.0);  // 78.54
```

#### Static Block (Initialization)
```java
public class DatabaseConnection {
    private static Connection connection;
    
    static {
        try {
            // Initialize database connection once
            connection = DriverManager.getConnection("jdbc:mysql://localhost/db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection() {
        return connection;
    }
}
```

## 2. `super` Keyword

### What is `super`?
The `super` keyword refers to the parent class (superclass) of the current class. It allows access to parent class members and constructors.

### Why use `super`?
- To call parent class constructors
- To access parent class methods or variables when overridden
- To maintain inheritance hierarchy properly

### Where it can be used:
- **Constructors**: Call parent constructor (`super()`)
- **Methods**: Access parent method (`super.methodName()`)
- **Variables**: Access parent field (`super.fieldName`)

### Use Cases:
- Constructor chaining in inheritance
- Method overriding with parent functionality
- Accessing hidden parent members
- Multiple inheritance simulation (interfaces)

### Benefits:
- Enables proper inheritance behavior
- Avoids code duplication in constructors
- Allows extending parent functionality
- Maintains encapsulation in inheritance

### Code Examples:

#### Constructor Chaining
```java
class Animal {
    String name;
    
    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    String breed;
    
    public Dog(String name, String breed) {
        super(name);  // Call parent constructor
        this.breed = breed;
    }
}

// Usage
Dog dog = new Dog("Buddy", "Golden Retriever");
```

#### Accessing Parent Method
```java
class Vehicle {
    public void start() {
        System.out.println("Vehicle starting...");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        super.start();  // Call parent method first
        System.out.println("Car engine started!");
    }
}

// Usage
Car car = new Car();
car.start();
// Output:
// Vehicle starting...
// Car engine started!
```

#### Accessing Parent Variable
```java
class Parent {
    int value = 10;
}

class Child extends Parent {
    int value = 20;  // Hides parent value
    
    public void printValues() {
        System.out.println("Child value: " + value);
        System.out.println("Parent value: " + super.value);
    }
}

// Usage
Child child = new Child();
child.printValues();
// Output:
// Child value: 20
// Parent value: 10
```

## 3. `final` Keyword

### What is `final`?
The `final` keyword makes a variable, method, or class immutable or non-extendable.

### Why use `final`?
- To create constants
- To prevent method overriding
- To prevent class inheritance
- To ensure thread safety

### Where it can be used:
- **Variables**: Constants and immutable fields
- **Methods**: Prevent overriding
- **Classes**: Prevent inheritance
- **Parameters**: Make method parameters immutable

### Use Cases:
- Mathematical constants (PI, E)
- Configuration values
- Immutable objects
- Template methods
- Security-sensitive classes

### Benefits:
- Thread safety
- Performance optimization
- Design clarity
- Prevents accidental modification

### Code Examples:

#### Final Variable (Constant)
```java
public class MathConstants {
    public static final double PI = 3.14159;
    public static final int MAX_VALUE = 100;
    
    public final String CONFIG_PATH;  // Must be initialized in constructor
    
    public MathConstants() {
        CONFIG_PATH = "/etc/config";
    }
}
```

#### Final Method
```java
class Shape {
    public final double calculateArea() {
        // Core area calculation - cannot be overridden
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;
    
    // calculateArea() cannot be overridden here
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
```

#### Final Class
```java
public final class StringUtils {
    // Utility class - cannot be extended
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}

// This would cause compilation error:
// class MyStringUtils extends StringUtils { }
```

## 4. `abstract` Keyword

### What is `abstract`?
The `abstract` keyword declares classes and methods that must be implemented by subclasses.

### Why use `abstract`?
- To define common interfaces
- To enforce implementation in subclasses
- To create polymorphic behavior
- To design extensible frameworks

### Where it can be used:
- **Classes**: Abstract classes (cannot be instantiated)
- **Methods**: Abstract methods (no implementation)

### Use Cases:
- Framework design
- Plugin architectures
- Strategy patterns
- Template method patterns

### Benefits:
- Enforces design contracts
- Enables polymorphism
- Reduces code duplication
- Improves maintainability

### Code Examples:

#### Abstract Class and Method
```java
abstract class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    // Abstract method - must be implemented by subclasses
    public abstract void makeSound();
    
    // Concrete method
    public void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Usage
Animal dog = new Dog("Buddy");
Animal cat = new Cat("Whiskers");
dog.makeSound();  // Woof!
cat.makeSound();  // Meow!
```

## 5. `this` Keyword

### What is `this`?
The `this` keyword refers to the current instance of the class.

### Why use `this`?
- To distinguish instance variables from parameters
- To call other constructors in the same class
- To pass current object as parameter
- To return current object (method chaining)

### Where it can be used:
- **Constructors**: Constructor chaining
- **Methods**: Access instance members
- **Variables**: Resolve naming conflicts

### Use Cases:
- Constructor overloading
- Setter methods
- Method chaining (fluent interfaces)
- Passing self to other methods

### Benefits:
- Resolves naming ambiguities
- Enables constructor chaining
- Supports fluent APIs
- Improves code readability

### Code Examples:

#### Constructor Chaining
```java
public class Person {
    private String name;
    private int age;
    private String address;
    
    // Default constructor
    public Person() {
        this("Unknown", 0, "Unknown");  // Call parameterized constructor
    }
    
    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
```

#### Resolving Variable Names
```java
public class Employee {
    private String name;
    private double salary;
    
    public void setName(String name) {
        this.name = name;  // 'this.name' refers to field, 'name' is parameter
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void display() {
        System.out.println("Name: " + this.name + ", Salary: " + this.salary);
    }
}
```

#### Method Chaining
```java
public class StringBuilder {
    private String result = "";
    
    public StringBuilder append(String str) {
        this.result += str;
        return this;  // Return current object for chaining
    }
    
    public String toString() {
        return result;
    }
}

// Usage
StringBuilder sb = new StringBuilder();
String result = sb.append("Hello").append(" ").append("World").toString();
// Result: "Hello World"
```

## Summary

These keywords form the foundation of Java's object-oriented programming:

- **`static`**: For class-level members and utilities
- **`super`**: For parent class access and inheritance
- **`final`**: For immutability and design constraints
- **`abstract`**: For defining contracts and polymorphism
- **`this`**: For instance reference and constructor chaining

Understanding these keywords is crucial for writing maintainable, efficient, and well-designed Java code. Practice with the examples provided and experiment with different combinations to deepen your understanding.
