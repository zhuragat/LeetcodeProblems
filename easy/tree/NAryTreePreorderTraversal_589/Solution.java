package easy.tree.NAryTreePreorderTraversal_589;

import easy.tree.Node;

import java.util.ArrayList;
import java.util.List;

/**
 589. N-ary Tree Preorder Traversal
 https://leetcode.com/problems/n-ary-tree-preorder-traversal/

 Given an n-ary tree, return the preorder traversal of its nodes' values.

 For example, given a 3-ary tree:

 Return its preorder traversal as: [1,3,5,6,2,4].

 Note:

 Recursive solution is trivial, could you do it iteratively?
 */
class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        preOrderTraversal(root);
        return result;
    }

    private void preOrderTraversal(Node root){
        if (root == null) return;
        result.add(root.val);
        for (Node child : root.children) preOrderTraversal(child);
    }
}