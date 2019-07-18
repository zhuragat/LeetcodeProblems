package easy.tree.SearchInABinarySearchTree_700;

import easy.tree.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node = new TreeNode(4);
        node.right = new TreeNode(7);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);
        System.out.println(solution.searchBST(node, 2));
    }
}
