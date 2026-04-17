// Vehicle.java
// This file demonstrates the use of interfaces in Java for abstraction and multiple inheritance.
// Interfaces define contracts that implementing classes must fulfill.
// A class can implement multiple interfaces, unlike single inheritance with classes.

import java.util.*;

// Empty interface - can be used as a marker interface
interface Xyz {
}

// Interface defining a contract for vehicles
interface Vehicle{
    // Constant in interface (implicitly public static final)
    public static final String CarModel = "BMW";

    // Abstract method that must be implemented by implementing classes
    public abstract void steer();// it must be implemented in derived  / child class
}

// Class implementing multiple interfaces (multiple inheritance)
class Car implements Vehicle, Xyz{ // multiple inheritance can be achieved in java using interface

    // Implementation of the abstract method from Vehicle interface
    @Override
    public void steer() {
        System.out.println("Steering the " + CarModel);
    }

    // Static method for sensing (not part of interface)
    public static String Sensor(){
        Scanner sensor = new Scanner(System.in);
        System.out.println("Sensing...");
        String vehicle = sensor.next();
        return vehicle;
    }
}

// Main class to demonstrate usage
class Main{
    public static void main(String[] args) {
        Scanner sensor = new Scanner(System.in);
        String vehicle;
        // Call static method on Car class
        vehicle =  Car.Sensor();
        System.out.println(vehicle);
    }
}

