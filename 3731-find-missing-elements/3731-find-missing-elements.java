class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        boolean[] present=new boolean[101];
        for(int i=0;i<nums.length;i++){
            present[nums[i]]=true;
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);

    }
    List<Integer> ans=new ArrayList<>();

    
        for(int i=min;i<max;i++){
        if(!present[i]){
            ans.add(i);
        }
    }
    
    
return ans;
    }
}