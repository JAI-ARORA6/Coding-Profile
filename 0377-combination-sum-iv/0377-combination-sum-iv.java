class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp=new int[target+1];
        Arrays.fill(dp,-1);
        return fun(nums,target,dp);
    }

    public int fun(int[] nums,int target,int[] dp){
        if(target==0){
            return 1;
        }

        if(dp[target]!=-1){
            return dp[target];
        }
        int ans=0;
       for(int num:nums){
        if(num<=target){

        
        ans+=fun(nums,target-num,dp);
        }
       }

        return dp[target]=ans;
    }
}