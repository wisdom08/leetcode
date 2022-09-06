class Solution {
    public boolean isValid(String s) {
            int len = 0;
        do {
            len = s.length();
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        } while (len != s.length());

        return s.isBlank();
    }
}