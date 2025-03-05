// Given an array nums. We define a running sum of an array as runningSum [i] sum(nums[0] - nums[i]).
// Return the running sum of nums.

import java.util.*;

class RunningSum {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = (i == 0) ? nums[i] : ans[i - 1] + nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4}; // Example input
        RunningSum obj = new RunningSum();
        int[] result = obj.runningSum(nums);

        // Print the result
        System.out.println(Arrays.toString(result));
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n) (due to the output array).