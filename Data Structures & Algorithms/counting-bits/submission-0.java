class Solution {
    public int[] countBits(int n) {
        // int res = 0;
        int[] res = new int[n+1];

        for (int i = 0; i <= n; i++) {
            int val = 0;
            int tempN = i;
            while (tempN > 0) {
                val += tempN % 2 == 1 ? 1 : 0;
                tempN /= 2;
            }
            res[i] = val;
        }
        return res;
    }
}
