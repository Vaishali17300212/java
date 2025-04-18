import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt(); // Read number of rows
        int cols = sc.nextInt(); // Read number of columns
        
        // If it's not a square matrix, exit the program
        if (rows != cols) {
            System.out.println("Not a square matrix");
            return;
        }

        int[][] matrix = new int[rows][cols];

        // Read matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate left and right diagonal sums
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < rows; i++) {
            leftSum += matrix[i][i];              // Left diagonal
            rightSum += matrix[i][cols - i - 1];  // Right diagonal
        }

        // If the matrix size is odd, adjust for center element counted twice
        if (rows % 2 != 0) {
            rightSum -= matrix[rows / 2][cols / 2];
        }

        int result = leftSum + rightSum;

        // Output the results
        System.out.println(leftSum);
        System.out.println(rightSum);
        System.out.println(result);

        sc.close();
    }
}
