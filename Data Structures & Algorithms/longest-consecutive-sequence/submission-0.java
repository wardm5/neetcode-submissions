class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        int i = 0;
        int max = 0;
        for (int val : set) {
            i = val;
            while (set.contains(i++)) {
                max = Math.max(max, i - val);
            }
        }
        return max;
    }
}
