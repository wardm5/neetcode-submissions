class Solution {
    public int[] productExceptSelf(int[] nums) {
        helper(nums, 0, 1);
        return nums;
    }
    private int helper(int[] nums, int i, int val) {
        if (i == nums.length - 1) {
            int tempVal = nums[i];
            nums[i] = val;
            return tempVal;
        }
        int forwardVal = helper(nums, i+1, val * nums[i]);
        int curr = nums[i];
        nums[i] = val * forwardVal;
        return forwardVal * curr;
    }
}  
