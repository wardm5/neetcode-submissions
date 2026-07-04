class Solution {
    public int missingNumber(int[] nums) {
        int sum = -nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum -= i;
        }
        return Math.abs(sum);
    }
}
