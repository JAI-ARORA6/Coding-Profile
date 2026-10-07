class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int sum=0;
        while(i<j){
            sum=numbers[i]+numbers[j];
            if(sum>target){
                sum=sum-numbers[j];
                j--;
                sum=sum+numbers[i];
            }
            else if(sum<target){
                sum=sum-numbers[i];
                i++;
                sum=sum+numbers[i];
            }
            else{
                return new int[]{i+1,j+1};
            }
        }
        return new int[]{-1,-1};
    }
}