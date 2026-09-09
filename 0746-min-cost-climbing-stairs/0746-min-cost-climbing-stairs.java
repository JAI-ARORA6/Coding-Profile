class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev2=cost[0];
        int prev1=cost[1];
        int curr=0;
        for(int i=2;i<cost.length;i++){
          curr= cost[i]+Math.min(prev2,prev1);
          prev2=prev1 ;
          prev1=curr;
        }
        return Math.min(prev1,prev2);
    }
}