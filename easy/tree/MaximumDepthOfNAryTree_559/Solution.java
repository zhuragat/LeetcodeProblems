package easy.tree.MaximumDepthOfNAryTree_559;

import easy.tree.Node;

class Solution {
    public int maxDepth(Node root) {
        if (root == null)
            return 0;
        int max = 0;
        for (Node node : root.children) {
            max = Math.max(max, maxDepth(node));
        }
        return max + 1;
    }
}
