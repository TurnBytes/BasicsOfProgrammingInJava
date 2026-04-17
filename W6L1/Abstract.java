// Abstract.java
// This file demonstrates the use of abstract classes in Java for abstraction.
// Abstract classes cannot be instantiated and are meant to be subclassed.
// They can contain both abstract methods (without implementation) and concrete methods.

abstract class Abstract{

    int xyz;  // Instance variable
    final int z = 33;  // Final constant

    // Abstract method: must be implemented by any concrete subclass
    public abstract void work();

    // Concrete method: provides implementation that subclasses inherit
    public void sound(){
        System.out.println("Meo Meo");
    }

}

// Concrete class that extends the abstract class
class Test extends Abstract{

    // Implementation of the abstract method
    @Override
    public void work(){
        System.out.println("Working...");
    }
}


