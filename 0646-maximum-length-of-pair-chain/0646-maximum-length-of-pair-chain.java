class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int[] dp=new int[pairs.length];
        Arrays.fill(dp,-1);
        int res=fun(pairs,0,Integer.MIN_VALUE,dp);
        return res;
    }
    private int fun(int[][] pairs,int i,int prevPairStartVal,int[] dp){
        if(i>=pairs.length){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }
        int include=0,skip=0;

        if(pairs[i][0]>prevPairStartVal){
            include=1+fun(pairs,i+1,pairs[i][1],dp);
        }
        skip=fun(pairs,i+1,prevPairStartVal,dp);

        dp[i]=Math.max(include,skip);
        return dp[i];
    }
}