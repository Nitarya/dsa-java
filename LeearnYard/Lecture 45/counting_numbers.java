//Given an array nums containing n distinct numbers in the range [0, n],
//return the only number in the range that is missing from the array...

class counting_numbers {
    public:
    int missingNumber(vector<int>& nums) {
        int N = nums.size();

        int missingNumber = -1;

        for(int curNum = 0; curNum <= N; ++curNum) {
            bool found = false;

            //Check if curNum is present or not
            for(int num: nums) {
                if(num == curNum) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                missingNumber = curNum;
                break;
            }
        }

        return missingNumber;
    }
}