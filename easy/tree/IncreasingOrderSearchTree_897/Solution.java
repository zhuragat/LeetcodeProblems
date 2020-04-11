package easy.tree.IncreasingOrderSearchTree_897;

import easy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> list = new ArrayList<>();

    public TreeNode increasingBST(TreeNode root) {
        traverse(root);

        TreeNode head = new TreeNode(0);
        TreeNode next = head;
        for (Integer integer : list) {
            next.right = new TreeNode(integer);
            next = next.right;
        }

        return head.right;
    }

    void traverse(TreeNode root){
        if (root != null){
            traverse(root.left);
            list.add(root.val);
            traverse(root.right);
        }
    }
}
