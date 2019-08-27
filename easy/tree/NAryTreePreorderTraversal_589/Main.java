package easy.tree.NAryTreePreorderTraversal_589;

import easy.tree.Node;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Node children1 = new Node(3, new ArrayList<>());
        children1.children.add(new Node(5, new ArrayList<>()));
        children1.children.add(new Node(6, new ArrayList<>()));

        Node children2 = new Node(2, new ArrayList<>());
        Node children3 = new Node(4, new ArrayList<>());

        Node root = new Node(1, new ArrayList<>());
        root.children.add(children1);
        root.children.add(children2);
        root.children.add(children3);

        System.out.println(solution.preorder(root));
    }
}
