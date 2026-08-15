class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];

        for(int num: nums ){
            if(num<min) min=num;
            if(num>max) max=num;

        }
        return gcd(min,max);
        
        
    }
    public int gcd(int a,int b){
while(a!=0){
        int temp=a;
        a=b%a;
        b=temp;
        }
        return b;
    }
}