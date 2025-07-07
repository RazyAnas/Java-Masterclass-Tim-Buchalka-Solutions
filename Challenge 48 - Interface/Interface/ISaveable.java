package Interface;

import java.util.List;

// ISaveable (interface)
// - It has two methods:
public interface ISaveable {

    // write(), takes no arguments and returns a List containing objects of type String.
    abstract List<String> write();

    // read(), takes a List of type String and doesn't return anything.
    abstract void read(List<String> list);

}

