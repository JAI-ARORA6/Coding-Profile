class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
       return  fun(coins,amount,0,dp);
    }

    public int fun(int[] coins,int amount,int i,int[][] dp){

        if(i==coins.length){
            return amount==0?1:0;
        }
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }


        int notTake=fun(coins,amount,i+1,dp);
        int take=0;
        if(coins[i]<=amount){
            take=fun(coins,amount-coins[i],i,dp);
        }

        return dp[i][amount]=take+notTake;

    }
}