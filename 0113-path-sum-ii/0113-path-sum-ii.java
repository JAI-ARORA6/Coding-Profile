/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        int sum=0;
        List<Integer> diary=new ArrayList<>();
        fun(root,sum,diary,targetSum);
        return res;
    }
    public void fun(TreeNode root,int sum,List<Integer> diary,int targetSum){
        if(root==null){
            return;
        }

        sum+=root.val;
        diary.add(root.val);
        if(root.left==null && root.right==null){
            if(sum==targetSum){

            
            res.add(new ArrayList<>(diary));
            diary.remove(diary.size()-1);
            return;
            }

        }

        fun(root.left,sum,diary,targetSum);
        fun(root.right,sum,diary,targetSum);
        diary.remove(diary.size()-1);
    }
}