class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0, right = left + 1;
        set.add(nums[0]);
        for ( ; left < nums.length - 1 && right < nums.length; ) {
            if (right - left > k) {
                set.remove(nums[left]);
                left++;
            } else if (!set.add(nums[right++]))
                return true;
        }
        return false;
    }
}