// Person.java
// This program demonstrates inheritance and polymorphism in Java.
// Inheritance allows a class to inherit properties and methods from another class.
// Polymorphism allows objects of different classes to be treated as objects of a common superclass.

package BasicsOfInheritance;

// Base class representing a Person
public class Person {
    // Protected fields - accessible in subclasses
    protected String name = "Kamal";
    protected String address;
    protected int age;

    // Method that can be overridden by subclasses
    public void work(String worktype){
        System.out.println("I am working as "+ worktype);
    }
}

// Subclass that extends Person - demonstrates inheritance
class Student extends Person{

    // Overridden method - demonstrates polymorphism
    @Override
    public void work(String worktype){
        System.out.println("I am working as "+ worktype);
    }

    // Main method to demonstrate the concepts
    public static void main(String[] args) {
        // Create an instance of Student
        Student std = new Student();

        // Access inherited field
        System.out.println(std.name);

        // Call overridden method
        std.work("Student");  // Note: there's a typo in the string, should be "Student"
    }
}
