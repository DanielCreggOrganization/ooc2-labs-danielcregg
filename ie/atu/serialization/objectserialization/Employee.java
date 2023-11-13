package ie.atu.serialization.objectserialization;

import java.io.Serializable; // Used to mark a class as serializable

public class Employee implements Serializable {
	// The serialVersionUID is used during deserialization to verify that the sender
	// and receiver of a serialized object have loaded classes for that object that
	// are compatible with respect to serialization.
	private static final long serialVersionUID = 1L;

    // Class variables
    public static final String COMPANY_NAME = "Intel"; // Is not serialized

    // Instance variables
    private String name;
    private transient String ppsn;

    // Constructor
    public Employee(String name, String ppsn) {
        this.name = name;
        this.ppsn = ppsn;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getPpsn() {
        return ppsn;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPpsn(String ppsn) {
        this.ppsn = ppsn;
    }
}
