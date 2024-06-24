public class Computer implements Electronic {

    Ram ram;
    Storage storage;
    Processor cpu;

    public Computer(Ram ram, Processor cpu, Storage storage) {
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", cpu=" + cpu +
                ", storage=" + storage +
                "}";
    }

    @Override
    public boolean on() {
        return false;
    }

    @Override
    public boolean off() {
        return false;
    }
}

/*
 * 1. Class Definition:
 * 
 * public class Computer implements Electronic { ... }:
 * public: This makes the Computer class accessible from other parts of your
 * project.
 * class Computer: This declares the name of the class.
 * implements Electronic: This indicates that the Computer class implements an
 * interface called Electronic. Interfaces define a set of methods that a class
 * must implement, ensuring certain functionalities are provided. In this case,
 * we can assume the Electronic interface likely defines methods related to
 * electronic devices, such as turning on and off.
 * 2. Instance Variables:
 * 
 * Ram ram;: This line declares a variable named ram of type Ram. We can assume
 * Ram is another class (perhaps defined elsewhere) that represents the
 * computer's Random Access Memory. Similarly,
 * Storage storage; likely represents the computer's storage (hard drive or
 * SSD).
 * Processor cpu; likely represents the computer's central processing unit
 * (CPU). These variables will store references to objects of their respective
 * types, allowing the Computer object to access information about its RAM,
 * storage, and CPU.
 * 3. Constructor:
 * 
 * public Computer(Ram ram, Processor cpu, Storage storage) { ... }: This is the
 * constructor of the Computer class. It's a special method that gets called
 * whenever a new Computer object is created using the new keyword.
 * public: This indicates the constructor can be accessed from other code.
 * Ram ram, Processor cpu, Storage storage: These are the parameters of the
 * constructor. When creating a new Computer object, you'll need to provide
 * instances of Ram, Processor, and Storage classes to initialize the
 * corresponding instance variables.
 * this.ram = ram;: Inside the constructor, this line assigns the value of the
 * ram parameter to the ram instance variable of the current object (this refers
 * to the newly created object). Similar assignments happen for cpu and storage.
 * 4. toString() Method:
 * 
 * @Override: This annotation indicates that this method overrides a method from
 * the Electronic interface.
 * public String toString() { ... }: This method is used to convert an object to
 * a human-readable string representation. It's often called when you print an
 * object using System.out.println(object).
 * The code within the curly braces defines how the Computer object should be
 * represented as a string. It uses string interpolation (String.format syntax)
 * to create a string that includes the values of the ram, cpu, and storage
 * instance variables.
 * 5. on() and off() Methods:
 * 
 * @Override: These annotations again indicate they override methods from the
 * Electronic interface.
 * public boolean on() { ... }: We can assume the Electronic interface defines
 * an on method to represent turning on an electronic device. However, in this
 * implementation, the Computer class simply returns false for both on and off
 * methods. This suggests that the current implementation might not handle power
 * management directly, or it might rely on other classes or mechanisms to
 * control the computer's power state.
 * In summary, this code defines a Computer class that models a computer system
 * with RAM, storage, and CPU components. It implements an Electronic interface,
 * but the provided implementation doesn't handle power management directly
 * within the Computer class itself.
 */