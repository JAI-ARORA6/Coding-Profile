class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        int sum=0;
        ArrayList<Integer> diary=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        backtrack(candidates,n,0,diary,sum,res,target);
        return res;
    }

    public void backtrack(int[] a,int n,int idx,ArrayList<Integer> diary,int sum,List<List<Integer>> res,int target){
        if(n==idx){
            if(sum==target){
                res.add(new ArrayList(diary));

            }
            return;
        }
        backtrack(a,n,idx+1,diary,sum,res,target);
        if(a[idx]+sum<=target){
            diary.add(a[idx]);
            sum=sum+a[idx];
            backtrack(a,n,idx,diary,sum,res,target);
            diary.remove(diary.size()-1);
            sum=sum-a[idx];
        }
        return;
    }
}