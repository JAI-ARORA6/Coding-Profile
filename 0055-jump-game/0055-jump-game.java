class Solution {
    public boolean canJump(int[] nums) {
        int maxindex=0, n=nums.length;
        for(int i=0;i<n-1;i++){
            if(i>maxindex){
                return false;
            }
            maxindex=Math.max(maxindex,i+nums[i]);
        }
        return maxindex>=n-1;
    }
}