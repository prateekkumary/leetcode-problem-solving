class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            // The number of 1s in i is the number of 1s in i / 2 + (i % 2)
            ans[i] = ans[i >> 1] + (i & 1);
        }

        return ans;
    }
}