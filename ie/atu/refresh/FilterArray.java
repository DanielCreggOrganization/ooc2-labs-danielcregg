package ie.atu.refresh;

public class FilterArray {
    public static void main(String[] args) {

        // Create integer array which holds number 1 to 100
        int[] numbers = new int[100];

        // Use a for loop to iterate through the array and populate it with numbers 1 to
        // 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // Use a for loop to iterate through the array and print out each element
        for (int i = 0; i < numbers.length; i++) {
            // Print all even numbers in the array
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
