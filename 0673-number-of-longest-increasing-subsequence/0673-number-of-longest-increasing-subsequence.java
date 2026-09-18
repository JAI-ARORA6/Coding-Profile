class Solution {
    class Pair{
        int len,count;
        Pair(int len,int count){
            this.len=len;
            this.count=count;
        }
    }
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        Pair[][] dp=new Pair[n][n+1];

        Pair ans=fun(nums,0,-1,dp);
        return ans.count;
    }

    private Pair fun(int[] nums,int i,int prev,Pair[][] dp){
        if(i==nums.length){
            return new Pair(0,1);
        }
        if(dp[i][prev+1]!=null){
            return dp[i][prev+1];
        }

        Pair ignore=fun(nums,i+1,prev,dp);
        Pair take=new Pair(-1,0);
        if(prev==-1 || nums[i]>nums[prev]){
            Pair next=fun(nums,i+1,i,dp);
            take=new Pair(1+next.len,next.count);
        }
        Pair result;
        if(take.len>ignore.len){
            result=take;
        }
        else if(ignore.len>take.len){
            result=ignore;
        }
        else{
            result=new Pair(take.len,take.count+ignore.count);
        }
        dp[i][prev+1]=result;
        return result;
    }
}