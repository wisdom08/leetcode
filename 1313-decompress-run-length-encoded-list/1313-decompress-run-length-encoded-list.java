class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < length; i+=2) {
            int count = nums[i];
            int value = nums[i + 1];
            for (int j = 0; j < count; j++) {
                list.add(value);
            }
        }

        int size = list.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = list.get(i);
        }
        return result;  
    }
}