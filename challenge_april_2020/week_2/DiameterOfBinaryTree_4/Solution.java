package challenge_april_2020.week_2.DiameterOfBinaryTree_4;

import easy.tree.TreeNode;

class Solution {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    int depth(TreeNode root){
        if (root == null){
            return 0;
        } else{
            int left = depth(root.left);
            int right = depth(root.right);
            max = Math.max(max, left + right);
            return 1 + Math.max(left, right);
        }
    }
}
