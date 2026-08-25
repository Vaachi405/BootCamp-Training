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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        inOrder(root,ans);
        return ans.get(k-1);
    }
    private static void inOrder(TreeNode root, List<Integer> ans){
        if(root == null) return;
        inOrder(root.left, ans);
        ans.add(root.val);
        inOrder(root.right, ans);
    }
}