package ie.atu.exceptions;

public class OutOfBounds {

    public static void main(String[] args) {
        // Create an array of 4 elements
        int num[] = { 1, 2, 3, 4 };
        // Protect code by surrounding with try/catch block
        try {
            System.out.println(num[4]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception thrown  :" + ex);
        }  // End try/catch
        // This line will be printed whether or not there is an exception
        System.out.println("Out of the try/catch block");
    } // End main
}  // End Class