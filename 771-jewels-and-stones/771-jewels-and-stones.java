class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] stonesArr = stones.toCharArray();
        char[] jewelsArr = jewels.toCharArray();
        int sum = 0;
        for (char c : stonesArr) {
            for (char j : jewelsArr) {
                if (c == j) {
                    sum++;
                }
            }
        }
        return sum;
    }
}