class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        for(int num:nums){
            total+=num;
        }

        if(target>total || target<-total){
            return 0;
        }
        int[][] dp=new int[nums.length][2*total+1];

        for(int[] row:dp){
            Arrays.fill(row,-1);
        }

        return fun(nums,0,0,target,total,dp);

        
    }
    public int fun(int[] nums,int i,int sum,int target,int offset,int[][] dp){
        if(i==nums.length){
            return sum==target?1:0;
        }

        if(dp[i][sum+offset]!=-1){
            return dp[i][sum+offset];
        }
        int plus=fun(nums,i+1,sum+nums[i],target,offset,dp);
        int minus=fun(nums,i+1,sum-nums[i],target,offset,dp);

        return dp[i][sum+offset]=plus+minus;
    }
}