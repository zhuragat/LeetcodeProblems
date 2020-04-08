package challenge_april_2020.week_2.MiddleOfTheLinkedList_1;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = new int[]{1, 2, 3, 4, 5};
        ListNode head = createLinkedList(A);
        displayLinkedList(solution.middleNode(head));
    }

    private static ListNode createLinkedList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode currentNode = head;
        for (int i = 1; i < arr.length; i++) {
            currentNode.next = new ListNode(arr[i]);
            currentNode = currentNode.next;
        }
        return head;
    }

    private static void displayLinkedList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
