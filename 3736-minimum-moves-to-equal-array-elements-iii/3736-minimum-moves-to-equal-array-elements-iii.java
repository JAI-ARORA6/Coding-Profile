class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int x:nums){
            max=Math.max(x,max);
            sum+=x;
        }
        
        return max*nums.length-sum;
    }
}