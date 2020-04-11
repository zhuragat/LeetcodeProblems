package easy.tree.IncreasingOrderSearchTree_897;

import easy.tree.TreeNode;

class Solution {
    TreeNode ans = new TreeNode(0);
    TreeNode node = ans;

    public TreeNode increasingBST(TreeNode root) {
        traverse(root);
        return ans.right;
    }

    void traverse(TreeNode root) {
        if (root != null) {
            traverse(root.left);
            node.right = new TreeNode(root.val);
            node = node.right;
            traverse(root.right);
        }
    }
}
