class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = nums[0], currMax = nums[0];
        int min = nums[0], currMin = nums[0];

        int total = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(currMax + nums[i], nums[i]);
            max = Math.max(max, currMax);

            currMin = Math.min(currMin + nums[i], nums[i]);
            min = Math.min(min, currMin);

            total += nums[i];
        }
        if (max < 0)
            return max;
        return total - min > max ? total - min : max;
    }
}