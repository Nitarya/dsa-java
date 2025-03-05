import java.util.*;

class Main {
    public static voidmain(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        
        Solution sol = new Solution();

        System.out.println(sol.maxSubarray(arr));
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int cur_sum = 0, final_ans = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            cur_sum += nums[i];
            final_ans = Math.max(final_ans, cur_sum);

            if(cur_sum < 0)
                cur_sum = 0;
        }

        return final_ans;
    }
}