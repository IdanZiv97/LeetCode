/**
 * Solution to problem 21. Merge Two Sorted Lists
 * link: https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class mergeTwoSortedLists {
    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        if (list1 == null) {return list2;}
        if (list2 == null) {return list1;}
        ListNode sentry = new ListNode(-1);
        ListNode current = sentry;
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                current.next = list2;
                list2 = list2.next;
            } else {
                current.next = list1;
                list1 = list1.next;
            }
            // advance the current
            current = current.next;
        }
        if (list1 == null) {
            current.next = list2;
        }
        if (list2 == null) {
            current.next = list1;
        }
        // get the real head of the merged list
        return sentry.next;
    }
}