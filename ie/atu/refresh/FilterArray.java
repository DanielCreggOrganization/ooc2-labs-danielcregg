package ie.atu.refresh;

public class FilterArray {
    public static void main(String[] args) {
        // Create integer array which holds number 1 to 10
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Use a for loop to iterate through the array and print out each element
        for (int i = 0; i < numbers.length; i++) {
            // Print all even numbers in the array
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
