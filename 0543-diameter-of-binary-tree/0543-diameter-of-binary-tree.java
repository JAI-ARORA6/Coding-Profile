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
    public int diameterOfBinaryTree(TreeNode root) {
        fun(root);
        return res;
    }
    int res=0;
    public int fun(TreeNode root){
        if(root==null){
            return 0;
        }
        if(dp.containsKey(root)){
            return dp.get(root);
        }
        int left=fun(root.left);
        int right=fun(root.right);

        int sum=left+right;
        res=Math.max(res,sum);
        int height=1+Math.max(left,right);
        dp.put(root,height);
        return height;

    }
}