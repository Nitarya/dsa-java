// Question == Given a binary array number, return the max 
// no of consecutive 1's in the array...

class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println("Max Consecutive Ones: " + findMaxConsecutiveOnes(nums));
    }
}



// Time Complexity:
// The function findMaxConsecutiveOnes iterates through the nums array exactly once.
// Each element is processed in O(1) time.
// Since there is only one loop iterating through nums (of size n), the total time complexity is O(n).
// Space Complexity:
// The function uses only a few integer variables (maxCount, count), which take O(1) space.
// No extra data structures are used, meaning the space complexity is O(1).
// Final Complexity Analysis:
// Time Complexity: O(n)
// Space Complexity: O(1)
