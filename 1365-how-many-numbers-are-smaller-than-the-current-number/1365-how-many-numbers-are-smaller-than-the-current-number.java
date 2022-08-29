class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int length = nums.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            count = 0;
            for (int j = 0; j < length; j++) {
                if (i != j) {
                    if (nums[i] > nums[j]) count++;
                }
            }
            result[i] = count;
        }


        return result;
    }
}