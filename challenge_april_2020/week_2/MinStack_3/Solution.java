package challenge_april_2020.week_2.MinStack_3;

/**
 Min Stack
 https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3292/

 Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

 push(x) -- Push element x onto stack.
 pop() -- Removes the element on top of the stack.
 top() -- Get the top element.
 getMin() -- Retrieve the minimum element in the stack.


 Example:

 MinStack minStack = new MinStack();
 minStack.push(-2);
 minStack.push(0);
 minStack.push(-3);
 minStack.getMin();   --> Returns -3.
 minStack.pop();
 minStack.top();      --> Returns 0.
 minStack.getMin();   --> Returns -2.
 */
class MinStack {

    Node root;

    public MinStack() {
    }

    public void push(int x) {
        root = (root == null) ? new Node(x, x) : new Node(x, Math.min(x, root.min), root);
    }

    public void pop() {
        if(root != null) root = root.next;
    }

    public int top() {
        return root == null ? Integer.MIN_VALUE : root.value;
    }

    public int getMin() {
        return root == null ?  Integer.MIN_VALUE : root.min;
    }

    static class Node {
        int value;
        int min;
        Node next;

        Node(int value, int min) {
            this.value = value;
            this.min = min;
        }

        Node(int value, int min, Node next) {
            this.value = value;
            this.min = min;
            this.next = next;
        }
    }
}