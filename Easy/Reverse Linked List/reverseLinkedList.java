/**
 * reverseLinkedList
 */
public class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        // in a case we have an empty list or the size of the list is one
        if (head == null || head.next == null) {
             return head;
        }
        ListNode current = head;
        ListNode prev = null;
        /**
         * The idea is to switch each current and its next
         * We do so by assigning the current's next as the previous item (in the start it will be null)
         * and then to assign the previous item as the current item
         * We break the loop once we reach the last item in the list which will in current.next == null
         * This we we don't need to the loop but we still need to assign its next item in the list to the previous
         */
        while (true) {
            ListNode next = current.next;
            current.next = prev;
            if (next == null) {
                break;
            }
            prev = current;
            // changing the current item to the next item
            current = next;
        }
        return current;
    }
}