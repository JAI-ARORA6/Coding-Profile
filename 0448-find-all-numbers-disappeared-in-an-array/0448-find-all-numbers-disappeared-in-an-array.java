class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;

        Arrays.sort(nums);
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            
                set.add(num);
            
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}