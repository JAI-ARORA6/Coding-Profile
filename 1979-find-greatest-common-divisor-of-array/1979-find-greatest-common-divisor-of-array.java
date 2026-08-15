class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int b=nums[nums.length-1];
        int a=nums[0];
        while(b!=0){
            int temp=b;
            
            b=a%b;
            a=temp;


        }
        return a;
    }
}