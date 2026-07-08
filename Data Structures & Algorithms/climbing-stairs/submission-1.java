class Solution {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;

        int prior = 1, curr = 1;

        for (int i = 2; i <= n; i++) {
            int ans = prior + curr;
            prior = curr;
            curr = ans;
        }

        return curr;
    }
}