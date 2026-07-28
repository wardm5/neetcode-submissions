class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 1; i < nums.length; i++) {
            increasing = increasing && nums[i] >= nums[i-1];
            decreasing = decreasing && nums[i] <= nums[i-1];
        }
        return increasing || decreasing;
    }
}