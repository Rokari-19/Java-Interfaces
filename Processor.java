
public class Processor {
    String type = "core i5";
    int numberOfCores = 2;

    @Override
    public String toString() {
        return "type=" + type +
                ", numberOfCores=" + numberOfCores +

                "}";
    }
}

/*
 * Properties:
 * type: Stores a string representing the CPU type (e.g., "core i5" in this
 * example).
 * numberOfCores: Stores an integer representing the number of cores in the CPU
 * (e.g., 2 in this example).
 * toString() Method:
 * This method overrides the default behavior of toString() in Java.
 * It defines how a Processor object should be converted to a human-readable
 * string format.
 * The returned string includes the type and numberOfCores values.
 */