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
    public TreeNode invertTree(TreeNode root) {
        return mirror(root);
    }
    public TreeNode mirror(TreeNode r){
        if(r == null){
            return null;
        }
        TreeNode leftS = invertTree(r.left);
        TreeNode rightS = invertTree(r.right);
        r.left = rightS;
        r.right = leftS;
        return r;
    }

}