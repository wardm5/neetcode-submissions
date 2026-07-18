class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        for (int i = 0; i < 2; i++) {
            int val = i * nums.length;
            for (int num : nums) {
                res[val++] = num;
            }
        }
        return res;
    }
}