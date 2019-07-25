package easy.tree.RangeSumOfBST_938;

import easy.tree.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node = new TreeNode(10);
        node.right = new TreeNode(5);
        node.left = new TreeNode(15);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(7);
        node.right.right = new TreeNode(18);
        System.out.println(solution.rangeSumBST(node, 7, 15));
    }
}
