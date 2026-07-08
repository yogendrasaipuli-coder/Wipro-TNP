package practice;

public class MaxInMatrix {
    public static void main(String[] args) {
        // Validate that exactly 9 numbers are provided
        if (args.length < 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        try {
            int[][] matrix = new int[3][3];
            int count = 0;

            // Populate the 3x3 matrix from command line arguments
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = Integer.parseInt(args[count]);
                    count++;
                }
            }

            // Print the structured array
            System.out.println("The given array is :");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            // Assume the first element is the biggest initially
            int max = matrix[0][0];

            // Traverse the matrix to search for the highest number
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                }
            }

            System.out.println("The biggest number in the given array is " + max);

        } catch (NumberFormatException e) {
            System.out.println("Please ensure all 9 inputs are valid integers.");
        }
    }
}