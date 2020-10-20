package graphs;

public class UncrossedLines {
    public int maxUncrossedLines(int[] A, int[] B) {
        if(A.length==0 || B.length==0) return 0;
        //Approach is similar to LCS: Longest common subsequence.
        int[][] dp = new int[A.length+1][B.length+1];

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(A[i-1]==B[j-1])
                    dp[i][j]= 1+dp[i-1][j-1];
                else
                    dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[A.length][B.length];
    }
}
