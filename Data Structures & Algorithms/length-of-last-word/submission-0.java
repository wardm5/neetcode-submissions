class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int right = s.length() - 1;
        while (right >= 0 && s.charAt(right) == ' ')
                right--;

        for ( ; right >= 0 && s.charAt(right) != ' '; right--) {
            length++;
        }
        return length;
    }
}