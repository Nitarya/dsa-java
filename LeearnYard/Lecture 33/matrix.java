import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // Rows in Matrix 1
        int B = sc.nextInt(); // Columns in Matrix 1 / Rows in Matrix 2
        int C = sc.nextInt(); // Columns in Matrix 2

        int m1[][] = new int[A][B];
        int m2[][] = new int[B][C];
        int ans[][] = new int[A][C];

        // Input for first matrix
        for (int i = 0; i < A; i++) 
            for (int j = 0; j < B; j++)
                m1[i][j] = sc.nextInt();

        // Input for second matrix
        for (int i = 0; i < B; i++)
            for (int j = 0; j < C; j++)
                m2[i][j] = sc.nextInt();

        // Matrix Multiplication
        for (int i = 0; i < A; i++)
            for (int j = 0; j < C; j++) {
                int cur = 0;
                for (int k = 0; k < B; k++)
                    cur += m1[i][k] * m2[k][j];

                ans[i][j] = cur;
            }

        // Print the result matrix
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < C; j++)
                System.out.print(ans[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
