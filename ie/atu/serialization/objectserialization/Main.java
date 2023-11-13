package ie.atu.serialization.objectserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    // Throw exceptions from main
    public static void main(String[] args) {

        // Create an Employee object and serialize it to a file
        Employee employee = new Employee("John", "1234567AA");
        // Print the company name
        System.out.println("Company name: " + Employee.COMPANY_NAME);

        // Use try-with-resources to open the ObjectOutputStream
        try (FileOutputStream fos = new FileOutputStream("./resources/employee.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            // Write the Employee object to the ObjectOutputStream
            oos.writeObject(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("./resources/employee.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            // Read the Employee object from the ObjectInputStream
            Employee employee2 = (Employee) ois.readObject();
            System.out.println("Employee name: " + employee2.getName());
            System.out.println("Employee PPSN: " + employee2.getPpsn());
        } catch (Exception e) {
            e.printStackTrace();
        }

    } // End of main method
} // End of Main class
