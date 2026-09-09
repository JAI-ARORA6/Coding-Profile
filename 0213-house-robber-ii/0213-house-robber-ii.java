class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp2, -1);
        return Math.max(fun(nums,0,nums.length-2,dp),fun(nums,1,nums.length-1,dp2));
    }

    public int fun(int[] nums,int i,int end ,int[] dp){
        if(i>end){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int steal=nums[i]+fun(nums,i+2,end,dp);
        int skip=fun(nums,i+1,end,dp);

        return dp[i]=Math.max(steal,skip);
    }
}