import java.util.Scanner;

public class symmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows and columns (since the matrix should be square)
        System.out.print("Enter the size of the square matrix (rows and columns): ");
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Flag for symmetry (1 means symmetric, 0 means not symmetric)
        int flag = 1; // Assume matrix is symmetric initially

        // Check if the matrix is symmetric
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    flag = 0; // Set flag to 0 if matrix is not symmetric
                    break;
                }
            }
            if (flag == 0)
                break; // Exit outer loop if matrix is already found not symmetric
        }

        // Output result based on the flag
        if (flag == 1) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }

        sc.close();
    }
}
