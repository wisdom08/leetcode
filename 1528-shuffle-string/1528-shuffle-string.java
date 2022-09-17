class Solution {
    public String restoreString(String s, int[] indices) {
       int length = indices.length;
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[indices[i]] = s.charAt(i);
        }
        return String.valueOf(chars);
    }
}