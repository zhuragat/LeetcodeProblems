package challenge_april_2020.week_2.DiameterOfBinaryTree_4;

import easy.tree.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        System.out.println(solution.diameterOfBinaryTree(node));
    }
}
