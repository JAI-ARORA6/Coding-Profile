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
    private HashMap<TreeNode,Integer> dp=new HashMap<>();
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        fun(root);
        return res;
    }

    private int fun(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=fun(root.left);
        int right=fun(root.right);
        int ans=left+right;
        res=Math.max(res,ans);
        int height=1+Math.max(left,right);
        dp.put(root,height);
        return height;
    }
}