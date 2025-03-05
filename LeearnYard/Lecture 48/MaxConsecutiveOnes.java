public class MaxConsecutiveOnes {
    public static int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int l = 0;
        int ans = 0; // Initialize ans

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[l] == 0) {
                    zeroCount--;
                }
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println(longestOnes(nums, k)); // Output: 6
    }
}


// Time and Space Complexity Analysis
// Time Complexity
// The algorithm uses a sliding window approach with two pointers (l and r).

// Right pointer (r) moves from 0 to n-1 → O(n)
// Left pointer (l) only moves forward when needed → Each element is processed at most once, so the total work done is still O(n).
// ✅ Overall Time Complexity: O(n)

// Space Complexity
// The algorithm only uses a few integer variables (zeroCount, l, ans, r).
// ✅ Overall Space Complexity: O(1) (constant space)

// Summary
// Time Complexity: O(n)
// Space Complexity: O(1)
// This makes the solution very efficient for large inputs! 🚀







