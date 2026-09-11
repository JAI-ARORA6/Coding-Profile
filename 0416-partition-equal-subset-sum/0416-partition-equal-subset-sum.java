class Solution {
    public boolean canPartition(int[] nums) {
        int total=0;
        for(int num:nums){
            total+=num;
        }

        if(total%2!=0){
            return false;
        }
        int target=total/2;
        Boolean[][] dp=new Boolean[nums.length][target+1];
        return fun(nums,0,target,dp);
    }

    public boolean fun(int[] nums,int i,int target,Boolean[][] dp){
        if(target==0){
            return true;
        }
        if(target<0 ||i==nums.length){
            return false;
        }

        if(dp[i][target]!=null){
            return dp[i][target];
        }
        boolean take=fun(nums,i+1,target-nums[i],dp);
        boolean skip=fun(nums,i+1,target,dp);

        return dp[i][target]=take|| skip;
    }
}