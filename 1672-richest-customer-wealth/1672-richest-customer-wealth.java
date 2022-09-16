class Solution {
    public int maximumWealth(int[][] accounts) {
          int max = Integer.MIN_VALUE;
        for (int[] a : accounts) {
            int sum  = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            max = Math.max(max, sum);
        }

        return max;
    }
}