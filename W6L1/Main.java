// Main.java
// This file demonstrates the usage of an abstract class through its concrete subclass.
// Since abstract classes cannot be instantiated directly, we create an instance of the subclass Test.

class Main{

    public static void main(String[] args) {
        // Create an instance of Test, which extends the abstract class Abstract
        Test t = new Test();

        // Call the implemented abstract method
        t.work();

        // Call the inherited concrete method
        t.sound();
    }
}