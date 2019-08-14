package easy.tree.MergeTwoBinaryTrees_617;

import easy.tree.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node1 = new TreeNode(1);
        node1.left = new TreeNode(3);
        node1.right = new TreeNode(2);
        node1.left.left = new TreeNode(5);

        TreeNode node2 = new TreeNode(2);
        node2.left = new TreeNode(1);
        node2.right = new TreeNode(3);
        node2.left.right = new TreeNode(4);
        node2.right.right = new TreeNode(7);

        System.out.println(solution.mergeTrees(node1, node2));
    }
}
