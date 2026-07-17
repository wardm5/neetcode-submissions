class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; ) {
            while (i < nums.length && nums[i] == 0) {
                i++;
            }
            int tempMax = 0;
            while (i < nums.length && nums[i++] == 1) {
                tempMax++;
            }
            max = Math.max(max, tempMax);
        }
        return max;
    }
}