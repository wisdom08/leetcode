class Solution {
    public int numJewelsInStones(String jewels, String stones) {
         int count = 0;

        for (Character c : stones.toCharArray()) {
            if(jewels.contains(c.toString())) count++;
        }

        return count;
    }
}