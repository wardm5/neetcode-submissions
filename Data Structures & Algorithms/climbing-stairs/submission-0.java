class Solution {
    public int climbStairs(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int prior = 0;
        int curr = 1;
        int ans = 0;
        for (int i = 2; i <= n + 1; i++) {

            ans = curr + prior;
            prior = curr;
            curr = ans;
        }
        return ans;
    }
}
