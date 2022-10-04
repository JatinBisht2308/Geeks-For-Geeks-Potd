class Solution {
    boolean res = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        getsum(root, 0, targetSum);
        return res;
    }
    public void getsum(TreeNode node, int s, int ts) {
        if (node != null) {
            s += node.val;
            if (s == ts && node.left == null && node.right == null) {
                res = true;
            } 
            else {
                getsum(node.left, s, ts);
                getsum(node.right, s, ts);
            }
        }
    }
}