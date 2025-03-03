// Question == Given a binary array number, return the max 
// no of consecutive 1's in the array...

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int findMaxConsecutiveOnes(vector<int>& nums) {
    int maxCount = 0, count = 0;
    for (int num : nums) {
        if (num == 1) {
            count++;
            maxCount = max(maxCount, count);
        } else {
            count = 0;
        }
    }
    return maxCount;
}

int main() {
    vector<int> nums = {1, 1, 0, 1, 1, 1};
    cout << "Max Consecutive Ones: " << findMaxConsecutiveOnes(nums) << endl;
    return 0;
}

