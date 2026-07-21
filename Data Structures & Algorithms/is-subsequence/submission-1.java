class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        int val = 0;
        for (char c : t.toCharArray()) {
            if (c == s.charAt(val))
                val++;
            if (val == s.length())
                return true;
        }
        return false;
    }
}