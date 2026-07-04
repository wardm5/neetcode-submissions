class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;
        for (int i = 0; i <= nums.length; i++) {
            sum -= i;
        }
        return Math.abs(sum);
    }
}
