package ie.atu.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionsExample {
    public static void main(String[] args) {
        // Create a regular integer array
		int[] integerArray = new int[3];
		// Create an integer ArrayList
		List<Integer> integerArrayList = new ArrayList<>();
		// Create an integer LinkedList
		List<Integer> integerLinkedList = new LinkedList<>();

        // Add 3 integers to all arrays
		integerArray[0] = 1;
		integerArray[1] = 2;
		integerArray[2] = 3;
		integerArrayList.add(1);
		integerArrayList.add(2);
		integerArrayList.add(3);
		integerLinkedList.add(1);
		integerLinkedList.add(2);
		integerLinkedList.add(3);

        // Print the contents of all arrays
		System.out.println(integerArray);
		System.out.println(integerArrayList);
		System.out.println(integerLinkedList);

        // Print regular array
		System.out.print("[");
		for (int i = 0; i < integerArray.length; i++) {
			if (integerArray[i] != integerArray.length) {
				System.out.print(integerArray[i] + ", ");
			} else {
				System.out.println(integerArray[i] + "]");
			}
		}

        System.out.println("Print regular array with toString method");
		System.out.println(Arrays.toString(integerArray));

        // Get the first element from each array
		System.out.println("First element in the Integer Array: " + integerArray[0]);
		System.out.println("First element in the Integer ArrayList: " + integerArrayList.get(0));
		System.out.println("First element in the Integer LinkedList: " + integerLinkedList.get(0));

        // Get the last element from each array
		System.out.println("Last element in the Integer Array: " + integerArray[integerArray.length - 1]);
		System.out.println("Last element in the Integer ArrayList: " + integerArrayList.get(integerArrayList.size() - 1));
		System.out.println("Last element in the Integer LinkedList: " + integerLinkedList.get(integerLinkedList.size() - 1));

		// Add a new element which increases the length of the regular array
		int[] integerArrayBigger = new int[4]; // Create new array with 4 elements
		System.arraycopy(integerArray, 0, integerArrayBigger, 0, integerArray.length); // Copy all contents of old to new
		// OR do the below instead of the two lines above
		// int[] integerArrayBigger = Arrays.copyOf(integerArray, 4);
		// Add 4 to the last element of the array
		integerArrayBigger[integerArrayBigger.length - 1] = 4;
		// Print the new bigger array
		System.out.println("New Bigger Array: " + Arrays.toString(integerArrayBigger));

        integerArrayList.add(4);
		System.out.println(integerArrayList);
		integerLinkedList.add(4);
		System.out.println(integerLinkedList);

        // Remove the last element from the Array
		int[] integerArraySmaller = Arrays.copyOf(integerArrayBigger, 3);
		// Print the smaller array
		System.out.println("New Smaller Array: " + Arrays.toString(integerArraySmaller));

        integerArrayList.remove(integerArrayList.size() - 1);
		System.out.println(integerArrayList);
		integerLinkedList.remove(integerLinkedList.size() - 1);
		System.out.println(integerLinkedList);

        // Find the minimum value in the regular arrays
		int min = integerArray[0];
		for (int i = 1; i < integerArray.length; i++) {
			if (integerArray[i] < min) {
				min = integerArray[i];
			} // End if
		} // End for

		System.out.println(min);

        // Find minimum values in the ArrayLists and LinkedLists
		System.out.println(Collections.min(integerArrayList));
		System.out.println(Collections.min(integerLinkedList)); 

        // Create a ListIterator for the IntegerArrayList
		ListIterator<Integer> listIteratorForIAL = (ListIterator<Integer>) integerArrayList.listIterator();

		// Use the ListIterator to iterate over the IntegerArrayList
		System.out.println("Loop through the IntegerArrayList in forward direction:");
		while (listIteratorForIAL.hasNext()) {
			System.out.println(listIteratorForIAL.next());
		}

		System.out.println("\nTraversing the IntegerArrayList in backward direction:");
		while (listIteratorForIAL.hasPrevious()) {
			System.out.println(listIteratorForIAL.previous());
		}

    } // end main method
} // end Class
