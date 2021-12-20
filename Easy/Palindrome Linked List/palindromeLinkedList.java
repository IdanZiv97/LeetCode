/**
 * Solution to problem 234 Palindrome Linked List
 * link: https://leetcode.com/problems/palindrome-linked-list/
 */
public class palindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        // the case when the list is empty
        if (head == null) {
            return false;
        //the case when the length of the list is 1
        } else if (head.next == null) {
            return true;
        // the case when the length of the list is 2
        } else if (head.next.next == null) {
            return head.val == head.next.val;
        }
        // Observation: if the list in of even length, than if we make jumps of two, then at the end we should reach the mull element
        ListNode middle, end;
        middle = end = head;
        while (end != null && end.next != null) { // we will advance the end pointer by 2, and the middle pointer by 1 to get the middle
            middle = middle.next;
            end = end.next.next;
        }
        // check for odd lengthed list
        if (end != null) {
            middle = middle.next;
        }
        //reverse the middle linked list
        ListNode middleReversed = reverseList(middle);
        while(middleReversed != null) {
            if (middleReversed.val != head.val) {return false;}
            middleReversed = middleReversed.next;
            head = head.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while(true) {
            ListNode next = current.next;
            current.next = prev;
            if (next == null) {break;}
            prev = current;
            current = next;
        }
        return current;
    }
}
