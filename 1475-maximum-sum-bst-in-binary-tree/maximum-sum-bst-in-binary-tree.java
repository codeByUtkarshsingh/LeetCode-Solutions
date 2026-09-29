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
    static class Info{
        boolean isBST;
        int sum;
        int min;
        int max;
        public Info(boolean isBST,int sum,int min,int max){
            this.isBST = isBST;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }

    public int maxSumBST(TreeNode root) {
        Info f = largest(root);
        return maxSum;
    }
    int maxSum = 0;
    public Info largest(TreeNode root){
        if(root == null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info left = largest(root.left);
        Info right = largest(root.right);
        int sum = left.sum + right.sum + root.val;
        int min = Math.min(root.val,Math.min(left.min,right.min));
        int max = Math.max(root.val,Math.max(left.max,right.max));
        if(root.val <= left.max || root.val >= right.min){
            return new Info(false,sum,min,max);
        }
        if(left.isBST && right.isBST){
            maxSum = Math.max(sum,maxSum);
            return new Info(true,sum,min,max);
        }
        return new Info(false,sum,min,max);
    }
}