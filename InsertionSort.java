import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        printArray(array);

        insertionSort(array);

        System.out.println("\nSorted array:");
        printArray(array);

        scanner.close();
    }

    // Function to perform Insertion Sort
    static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    // Function to print an array
    static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

