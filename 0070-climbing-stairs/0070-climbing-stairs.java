class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return fun(n,0,dp);
    }
    public int fun(int n,int i,int[] dp){
        if(i > n){
            return 0;
        }
        if(i==n){
            return 1;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        int oneStep=fun(n,i+1,dp);
        int twoStep=fun(n,i+2,dp);
        return dp[i]=oneStep+twoStep;
    }
}