import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 elements for the array:");

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal Array:");
        printArray(array);

        // Perform Bubble Sort
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Array:");
        printArray(array);

        // Close the scanner
        scanner.close();
    }

    // Method to print the array
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
