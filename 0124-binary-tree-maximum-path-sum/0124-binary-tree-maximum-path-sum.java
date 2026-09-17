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
    private HashMap<TreeNode,Integer> dp=new HashMap<>();
    public int maxPathSum(TreeNode root) {
       
       fun(root);
        return ans;
    }

    public int fun(TreeNode root){
        if(root==null){
            return 0;
        }
        if(dp.containsKey(root)){
            return dp.get(root);
        }

        int leftsum=Math.max(0,fun(root.left));
        int rightsum=Math.max(0,fun(root.right));

        int current=leftsum+rightsum+root.val;
        ans=Math.max(ans,current);
        int res=Math.max(leftsum,rightsum)+root.val;
    dp.put(root,res);
        return res;
    }
}