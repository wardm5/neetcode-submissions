class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int word1Val = Integer.MAX_VALUE;
        int word2Val = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                word1Val = i;
                min = Math.min(min, Math.abs(word2Val - word1Val));
            }
            if (wordsDict[i].equals(word2)) {
                word2Val = i;
                min = Math.min(min, Math.abs(word1Val - word2Val));
            }
        }
        return min;
    }
}
