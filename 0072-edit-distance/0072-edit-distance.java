class Solution {
    public int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        
        for (int i = 0; i <= n1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n2; j++) {
            dp[0][j] = j;
        }
        
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int insertion = 1 + dp[i][j - 1];
                    int deletion = 1 + dp[i - 1][j];
                    int replacement = 1 + dp[i - 1][j - 1];
                    dp[i][j] = Math.min(insertion, Math.min(deletion, replacement));
                }
            }
        }
        
        return dp[n1][n2]; 
        
    }
}