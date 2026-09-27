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
    public int goodNodes(TreeNode root) {
        int ans = count(root,root.val);
        return ans;
    }
    public static int count(TreeNode r,int max){
        if(r==null){
            return 0;
        }
        int t = 0;
        if(r.val>=max){
            t=1;
        }
        max = Math.max(max,r.val);
        t+=count(r.left,max);
        t+=count(r.right,max);
        return t;
    }
}