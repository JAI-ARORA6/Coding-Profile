class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(nums.length==1) return nums[0];

        return Math.max(robRange(nums,0,n-2),robRange(nums,1,n-1));
      
    }

    private int robRange(int[] nums,int start,int end){
         int prev2=0;
       int prev=nums[start];
        for(int i=start+1;i<=end;i++){
            int include=nums[i]+prev2;
            int exclude=prev;
            int curr=Math.max(include,exclude);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}