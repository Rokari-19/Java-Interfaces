public interface Electronic {

    boolean onOrOff = false;

    boolean on();

    boolean off();

    default void electronic() {
        if (onOrOff) {
            System.out.println("Default status is off");
        }
    }
}

/*
 * The code defines an interface named Electronic. Here's a summary of its key
 * points:
 * 
 * Purpose: It outlines a blueprint for electronic devices.
 * Requirements: Any class implementing Electronic must provide methods to:
 * Turn on (on()) and turn off (off()) the device (returning true on success,
 * false otherwise).
 * Optional Default Behavior: It defines a electronic() method (using the
 * default keyword) that prints a message indicating the default state is off
 * (assuming the onOrOff static variable is false). This method can be
 * overridden in specific implementations.
 */