import java.util.Stack;
/**
 * reverseLinkedList - 0ms  runtime
 * 206. Reverse Linked List - https://leetcode.com/problems/reverse-linked-list/
 */
public class reverseUsingStack {

    public ListNode reversNode(ListNode head) {
        // in the case of a linked list with 1 node or an empty list
        if (head == null || head.next == null) {
            return head;
        }
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode current = head;
        
        // Because of the LIFO principle the list's node will be poped out in a reversed order
        while (current != null) {
            stack.push(current);
            current = current.next;
        }
        ListNode newHead = stack.peek();
        // we are wokring with pointers so we can assign the next for each individual node
        ListNode temp;
        while (!stack.empty()) {
            temp = stack.pop(); // in the first itteration it will be the head, afterwards the next element in the list
            if (!stack.empty()) {
                // in this case we know we have to create the next item
                ListNode next = stack.peek(); // this node will be handled in the next step of the while loop
                temp.next = next;
            } else { //if it is empty we have reached the last node - so it should point to null
                temp.next = null;
            }
        }
        return newHead;
    }
}