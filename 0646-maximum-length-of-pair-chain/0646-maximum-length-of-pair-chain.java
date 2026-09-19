class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int n=pairs.length;
        int[][] dp=new int[n][n+1];
        for(int[] row:dp ){

        
        Arrays.fill(row,-1);
        }
        int res=fun(pairs,0,-1,dp);
        return res;
    }
    private int fun(int[][] pairs,int i,int prev,int[][] dp){
        if(i==pairs.length){
            return 0;
        }

        if(dp[i][prev+1]!=-1){
            return dp[i][prev+1];
        }
        int include=0;

        if(prev==-1||pairs[i][0]>pairs[prev][1]){
            include=1+fun(pairs,i+1,i,dp);
        }
        int skip=fun(pairs,i+1,prev,dp);

        dp[i][prev+1]=Math.max(include,skip);
        return dp[i][prev+1];
    }
}