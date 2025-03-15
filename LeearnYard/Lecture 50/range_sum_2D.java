import java.util.Scanner;

class NumMatrix {
    private int[][] pre;

    public NumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        pre = new int[rows][cols];

        // Precompute prefix sum for the given matrix
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (r == 0 && c == 0) {
                    pre[r][c] = matrix[r][c];
                } else if (r == 0) {
                    pre[r][c] = pre[r][c - 1] + matrix[r][c];
                } else if (c == 0) {
                    pre[r][c] = pre[r - 1][c] + matrix[r][c];
                } else {
                    pre[r][c] = matrix[r][c] + pre[r - 1][c] + pre[r][c - 1] - pre[r - 1][c - 1];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = pre[row2][col2];

        if (row1 > 0)
            ans -= pre[row1 - 1][col2];

        if (col1 > 0)
            ans -= pre[row2][col1 - 1];

        if (row1 > 0 && col1 > 0)
            ans += pre[row1 - 1][col1 - 1];

        return ans;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Input matrix elements
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements row-wise:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Initialize NumMatrix object
        NumMatrix numMatrix = new NumMatrix(matrix);

        // Query sum regions
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println("Enter query (row1 col1 row2 col2): ");
            int row1 = sc.nextInt();
            int col1 = sc.nextInt();
            int row2 = sc.nextInt();
            int col2 = sc.nextInt();
            System.out.println("Sum of given region: " + numMatrix.sumRegion(row1, col1, row2, col2));
        }

        sc.close();
    }
}
