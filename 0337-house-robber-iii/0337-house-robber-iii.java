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
    public int rob(TreeNode root) {
        if(root==null){
            return 0;
    }
    if(dp.containsKey(root)){
        return dp.get(root);
    }

    int robCurrent=root.val;
    if(root.left!=null){
        robCurrent+=rob(root.left.left)+rob(root.left.right);
    }

    if(root.right!=null){
        robCurrent+=rob(root.right.left)+rob(root.right.right);
    }

    int doNotRobCurrent=0;
    doNotRobCurrent+=rob(root.left)+rob(root.right);

    int res=Math.max(robCurrent,doNotRobCurrent);
    dp.put(root,res);
    return res;

    

    }
}