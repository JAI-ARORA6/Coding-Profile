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

        int leftsum=Math.max(0,fun(root.left));
        int rightsum=Math.max(0,fun(root.right));

        int current=leftsum+rightsum+root.val;
        ans=Math.max(ans,current);
        return Math.max(leftsum,rightsum)+root.val;
    }
}