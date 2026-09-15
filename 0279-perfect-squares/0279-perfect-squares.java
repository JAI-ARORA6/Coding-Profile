class Solution {
    public int numSquares(int n) {
     int[] dp=new int[n+1];
     Arrays.fill(dp,-1);
    return fun(n,dp);
    }

    public int fun(int n,int[] dp){
        if(n==0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        int ans=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int square=i*i;
            int result=fun(n-square,dp);
            ans=Math.min(ans,1+result);
        }
        return dp[n]=ans;
    }
}