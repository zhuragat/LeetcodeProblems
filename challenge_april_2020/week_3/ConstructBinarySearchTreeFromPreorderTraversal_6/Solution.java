package challenge_april_2020.week_3.ConstructBinarySearchTreeFromPreorderTraversal_6;

import easy.tree.TreeNode;

class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 0) return null;

        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            buildTree(root, new TreeNode(preorder[i]));
        }
        return root;
    }

    void buildTree(TreeNode root, TreeNode node) {
        if (node.val < root.val){
            if (root.left == null)
                root.left = node;
            else
                buildTree(root.left, node);
        }

        if (node.val > root.val){
            if (root.right == null)
                root.right = node;
            else
                buildTree(root.right, node);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{8, 5, 1, 7, 10, 12};
        System.out.println(solution.bstFromPreorder(arr));
    }
}