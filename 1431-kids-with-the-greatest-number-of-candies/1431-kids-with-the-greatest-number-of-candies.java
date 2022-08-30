class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
          int length = candies.length;
        Boolean[] result = new Boolean[length];
        int max = 0;

        for (int candy : candies) {
            max = Math.max(candy, max);
        }

        for (int i = 0; i < length; i++) {
            result[i] = candies[i] + extraCandies >= max;
        }
        return Arrays.stream(result).toList();
    }
}