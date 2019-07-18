package easy.tree.UnivaluedBinaryTree_965;

import easy.tree.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node = new TreeNode(2);
        node.right = new TreeNode(2);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(5);
        node.left.right = new TreeNode(2);
        System.out.println(solution.isUnivalTree(node));
    }
}
