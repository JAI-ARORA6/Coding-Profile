class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return fun(nums,0,-1,dp);

    }
    private int fun(int [] nums,int i,int prev,int[][] dp){
        if(i==nums.length) return 0;
        if(dp[i][prev+1]!=-1) return dp[i][prev+1];
        
        int max=Integer.MIN_VALUE;
        int inc=Integer.MIN_VALUE;
        if(prev==-1 || nums[i]>nums[prev]){
            inc=1+fun(nums,i+1,i,dp);
        }
        int ignr=fun(nums,i+1,prev,dp);
        int ans=dp[i][prev+1]=Math.max(inc,ignr);
        return ans;
        
       
    }
}