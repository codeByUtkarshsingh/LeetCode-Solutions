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
    public boolean isValidBST(TreeNode root) {
        return valid(root,null,null);
    }
    public static boolean valid(TreeNode r,TreeNode min,TreeNode max){
        if(r == null){
            return true;
        }
        if(min!=null && r.val <= min.val) return false;
        else if(max != null && r.val >= max.val) return false;
        return valid(r.left,min,r) && valid(r.right,r,max);
    }
}