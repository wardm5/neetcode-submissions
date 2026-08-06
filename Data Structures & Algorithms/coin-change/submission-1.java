class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        // amount + 1 represents an impossible/unresolved value
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int currentAmount = 1; currentAmount <= amount; currentAmount++) 
            for (int coin : coins)
                if (coin <= currentAmount)
                    dp[currentAmount] = Math.min(dp[currentAmount], dp[currentAmount - coin] + 1);

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
