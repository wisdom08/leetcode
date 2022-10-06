import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
         int potentialMajority = nums[0];
        int count = 1;
        for (int num : nums) {
            if (potentialMajority == num) {
                ++count;
            } else {
                --count;
            }

            if (count == 0) {
                potentialMajority = num;
                count = 1;
            }
        }

        return potentialMajority;
    }
}