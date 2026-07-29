class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                // Minimum must be to the right of mid
                low = mid + 1;
            } else {
                // Mid could itself be the minimum
                high = mid;
            }
        }
        return nums[low];
    }
}
