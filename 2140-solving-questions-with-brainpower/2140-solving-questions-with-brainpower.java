class Solution {
    public long mostPoints(int[][] questions) {
        long[] dp=new long[questions.length];
        Arrays.fill(dp,-1);
        return fun(questions,0,dp);
    }

    public long fun(int[][] questions,int i,long[] dp){
        if(i>=questions.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        long take=questions[i][0]+fun(questions,i+questions[i][1]+1,dp);
        long notTake=fun(questions,i+1,dp);
        
        return dp[i]=Math.max(take,notTake);
    }
}