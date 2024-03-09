public class TwoByTwoArrayExample {
    public static void main(String[] args) {
        // Create a 2x2 array
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Example manipulation: Add 5 to each element
        addValueToMatrix(matrix, 5);

        // Print the modified matrix
        System.out.println("\nModified Matrix (Added 5 to each element):");
        printMatrix(matrix);
    }

    // Method to add a value to each element of the matrix
    private static void addValueToMatrix(int[][] matrix, int value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] += value;
            }
        }
    }

    // Method to print the matrix
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
