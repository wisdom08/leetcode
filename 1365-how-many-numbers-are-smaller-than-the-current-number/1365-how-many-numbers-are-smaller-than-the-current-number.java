class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] copy = nums.clone();
        int count = 0;
        Arrays.sort(copy);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : copy) {
            if (!map.containsKey(i)) {
                map.put(i, count);
            }
            count++;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}