
public class Storage {
    String type = "SSD";

    String manufacturer = "Samsung";

    int capacity = 512;

    @Override
    public String toString() {
        return "type=" + type +
                ", manufacturer=" + manufacturer +
                ", capacity=" + capacity +
                "}";
    }
}

/*
 * This code defines a class named Storage that likely represents the storage
 * device (e.g., hard drive or solid-state drive) in a computer system. Here's a
 * summary:
 * 
 * Properties:
 * type: Stores a string representing the storage type (e.g., "SSD" in this
 * example).
 * manufacturer: Stores a string representing the manufacturer of the storage
 * device (e.g., "Samsung" in this example).
 * capacity: Stores an integer representing the storage capacity in gigabytes
 * (GB) or other units (e.g., 512 GB in this example).
 * toString() Method:
 * This method overrides the default behavior of toString() in Java.
 * It defines how a Storage object should be converted to a human-readable
 * string format.
 * The returned string includes the type, manufacturer, and capacity values.
 */