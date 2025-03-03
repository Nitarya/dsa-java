// Given an array of integers Arr of size N and a number K. Return the
// maximum sum of a subarray of size K...



// Example
// Input
// N = 4, K =2
// Arr = [100, 200, 300, 400]
// Output
// 700
// Explanation:
// Arr3 + Arr4 = 700
// which is maximum.

import java.util.ArrayList;
import java.util.Arrays;

class MaxSumSubarray {
    static long maximumSumSubarray(int k, ArrayList<Integer> arr, int n) {
        long curSum = 0;
        long finalAns = 0;

        // Find curSum for the leftmost subarray of size k.
        for (int i = 0; i < k; i++)
            curSum += arr.get(i);

        finalAns = curSum;

        for (int st = 1, en = k; en < n; st++, en++) {
            curSum -= arr.get(st - 1);
            curSum += arr.get(en);
            finalAns = Math.max(finalAns, curSum);
        }

        return finalAns;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 1, 5, 1, 3, 2));
        int k = 3;
        int n = arr.size();

        long maxSum = maximumSumSubarray(k, arr, n);
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSum);
    }
}




// Time Complexity Analysis
// The function runs in O(N) time:
// The first loop runs O(k) times.
// The sliding window loop runs O(N - k) times.
// Total time complexity is O(N).
// Space Complexity
// Only a few variables (curSum, finalAns, st, en), so O(1) (constant space).

