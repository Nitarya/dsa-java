import java.util.Scanner;

class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int arr[][] = new int[R][C];

        // Take input
        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                arr[i][j] = sc.nextInt();

        // Print in spiral order
        int top = 0, bot = R - 1, left = 0, right = C - 1;

        while (top <= bot && left <= right) {
            // Step 1: Top row (left to right)
            for (int col = left; col <= right; col++)
                System.out.print(arr[top][col] + " ");
            top++;

            // Step 2: Right column (top to bottom)
            for (int row = top; row <= bot; row++)
                System.out.print(arr[row][right] + " ");
            right--;

            // Step 3: Bottom row (right to left) - Check if row still exists
            if (top <= bot) {
                for (int col = right; col >= left; col--)
                    System.out.print(arr[bot][col] + " ");
                bot--;
            }

            // Step 4: Left column (bottom to top) - Check if column still exists
            if (left <= right) {
                for (int row = bot; row >= top; row--)
                    System.out.print(arr[row][left] + " ");
                left++;
            }
        }
        sc.close();
    }
}
