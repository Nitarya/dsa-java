#include <iostream>
#include <vector>

using namespace std;

class RunningSum {
public:
    vector<int> runningSum(vector<int>& nums) {
        vector<int> ans(nums.size());

        for (int i = 0; i < nums.size(); i++) {
            ans[i] = (i == 0) ? nums[i] : ans[i - 1] + nums[i];
        }

        return ans;
    }
};

int main() {
    vector<int> nums = {1, 2, 3, 4}; // Example input
    RunningSum obj;
    vector<int> result = obj.runningSum(nums);

    // Print the result
    for (int num : result) {
        cout << num << " ";
    }

    return 0;
}
