class Solution {
    public int search(int[] nums, int target) {
          int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            System.out.println("mid = " + mid);
            if(nums[mid] == target ) return mid;
            else if (nums[mid] > target) {
                end = mid - 1;
                System.out.println("end = " + end);
            } else {
                start = mid + 1;
                System.out.println("start = " + start);
            }
        }
        return -1;
    }
}