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
    public static void main(String[] args) {
        ListNode l1_node1 = new ListNode(1);
        ListNode list1 = l1_node1;
        l1_node1.next = new ListNode(2);
        l1_node1 = l1_node1.next;
        l1_node1.next = new ListNode(4);
        ListNode l2_node2 = new ListNode(1);
        ListNode list2 = l2_node2;
        l2_node2.next = new ListNode(3);
        l2_node2 = l2_node2.next;
        l2_node2.next = new ListNode(4);
        ListNode newList = mergeTwoSortedLists.mergeLists(list1, list2);
        System.out.println("test");
    }
}