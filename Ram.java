
public class Ram {

    String name = "DDR4";
    int readspeed = 3;
    int writespeed = 24;

    @Override
    public String toString() {
        return "name=" + name +
                ", readspead=" + readspeed +
                ", writespeed=" + writespeed +
                "}";
    }
}

/*
 * Properties:
 * name: Stores a string representing the type of RAM (e.g., "DDR4" in this
 * example).
 * readspeed: Stores an integer representing the RAM's read speed, likely in
 * gigabytes per second (GB/s) or another unit (e.g., 3 GB/s in this example).
 * writespeed: Stores an integer representing the RAM's write speed, likely in
 * GB/s or another unit (e.g., 24 GB/s in this example).
 * toString() Method:
 * This method overrides the default behavior of toString() in Java.
 * It defines how a Ram object should be converted to a human-readable string
 * format.
 * The returned string includes the name, readspeed, and writespeed values.
 */