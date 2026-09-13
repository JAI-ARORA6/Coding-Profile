class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length][amount+1];
        for(int[] row:dp){

        
        Arrays.fill(row,-1);
        }
        int res=fun(coins,amount,0,dp);
        return res==Integer.MAX_VALUE?-1:res;
    }
    public int fun(int[] coins,int amount,int i,int[][] dp){
        if(amount==0){
            return 0;
        }
        if(i==coins.length){
            return Integer.MAX_VALUE;
        }

        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }
        int notTake=fun(coins,amount,i+1,dp);
        int take=Integer.MAX_VALUE;

        if(coins[i]<=amount){
            int result=fun(coins,amount-coins[i],i,dp);
        
        if(result!=Integer.MAX_VALUE){
            take=1+result;
        }
        }

return dp[i][amount]=Math.min(take,notTake);
    }
    
}