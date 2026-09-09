class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return fun(nums,0,dp);
    }

    public int fun(int[] nums,int i ,int[] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int steal=nums[i]+fun(nums,i+2,dp);
        int skip=fun(nums,i+1,dp);

        return dp[i]=Math.max(steal,skip);
    }
}