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
    public boolean isBalanced(TreeNode root) {
        boolean[] arr = new boolean[1];
        arr[0] = true;

        helper(root, arr);
        return arr[0];
    }
    private int helper(TreeNode root, boolean[] arr) {
        if (root == null)
            return 0;
        int left = helper(root.left, arr);
        int right = helper(root.right, arr);
        arr[0] = arr[0] && Math.abs(left - right) <= 1;
        return Math.max(left, right) + 1;
    }
}
