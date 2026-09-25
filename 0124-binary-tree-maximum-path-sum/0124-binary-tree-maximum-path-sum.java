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
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        fun(root);
        return ans;
    }
    public int fun(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftSum=Math.max(0,fun(root.left));
        int rightSum=Math.max(0,fun(root.right));
        int current=leftSum+rightSum+root.val;
        ans=Math.max(ans,current);

        return Math.max(leftSum,rightSum)+root.val;
    }
}