class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;

        int[] len=new int[n];
        int[] count=new int[n];
        Arrays.fill(len,1);
        Arrays.fill(count,1);

        int maxLen=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    int newLen=len[j]+1;

                    if(newLen>len[i]){
                        len[i]=newLen;
                        count[i]=count[j];
                    }
                    else if(newLen==len[i]){
                        count[i]+=count[j];
                    }
                }
            }
            maxLen=Math.max(maxLen,len[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(len[i]==maxLen){
                ans+=count[i];
            }
        }
        return ans;
    }
}