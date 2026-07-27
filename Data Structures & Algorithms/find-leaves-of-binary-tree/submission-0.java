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
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, root);
        return list;
    }
    public int helper(List<List<Integer>> list, TreeNode root) {
        if (root == null)
            return 0;
        int left = helper(list, root.right);
        int right = helper(list, root.left);
        int max = Math.max(left, right);
        if (list.size() <= max) {
            List<Integer> tempList = new ArrayList<>();
            tempList.add(root.val);
            list.add(tempList);
        } else {
            List<Integer> tempList = list.get(max);
            tempList.add(root.val);
        }
        return max + 1;
    }
}