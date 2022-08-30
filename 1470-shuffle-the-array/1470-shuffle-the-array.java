class Solution {
    public int[] shuffle(int[] nums, int n) {
    int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            result[index] = nums[i];
            result[index + 1] = nums[n + i];
            index += 2;
        }
        return result;
    }
}