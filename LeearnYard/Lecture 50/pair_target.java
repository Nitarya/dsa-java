import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for N (size of the array)
        System.out.print("Enter the size of the array (N): ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        // Taking input for array elements
        System.out.println("Enter " + N + " elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Taking input for target sum X
        System.out.print("Enter the target sum (X): ");
        int target = sc.nextInt();

        Solution sol = new Solution();
        
        // Checking if there exist two elements whose sum is exactly X
        if (sol.hasArrayTwoCandidates(arr, N, target)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // Hashing approach to check for required number
        boolean found[] = new boolean[100001];

        for (int i = 0; i < n; i++) {
            int req_num = x - arr[i];

            // Checking if the required number is already found
            if (req_num >= 1 && req_num <= 100000 && found[req_num]) {
                return true;
            }

            // Mark the current number as found
            found[arr[i]] = true;
        }
        return false;
    }
}

