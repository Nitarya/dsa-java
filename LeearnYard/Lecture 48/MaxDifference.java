class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1, min_till_now = nums[0];
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] > min_till_now) {
                ans = Math.max(ans, nums[j] - min_till_now);
            }
            min_till_now = Math.min(min_till_now, nums[j])
        }
        return ans;
    }
}