/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValidBST(TreeNode n, long min, long max){
        if(n == null) return true;
        if(n.val <= min || n.val >= max) return false;
        return isValidBST(n.left, min, n.val) && isValidBST(n.right, n.val, max);
    }
}