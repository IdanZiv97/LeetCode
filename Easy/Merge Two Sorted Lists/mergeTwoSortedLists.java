/**
 * mergeTwoSortedLists
 */
public class mergeTwoSortedLists {
    public mergeLists(ListNode list1, ListNode list2) {
        // if one of the lists is empty return the other
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode newList = null;
        // detremine the first element
        if (list1.val >= list2.val) {
            newList.val = list2.val;
            newList.next = null;
            list2 = list2.next;
        } else {
            newList.val = list1.val;
            newList.next = null;
            list1 = list1.next;
        }
        ListNode newHead = newList;
        // iterate through the lists and add the next element until you are done with one of the lists 
        while (list1 != null || list2 != null) {
            if (list1.val >= list2.val) {
                //create new node
                ListNode temp = new ListNode(list1.val);
                // add the new node to the list
                newList.next = temp;
                // update the new list
                newList = newList.next;
                // advance to the next node in the list
                list1 = list1.next;
            } else {
                //create new node
                ListNode temp = new ListNode(list2.val);
                // add the new node to the list
                newList.next = temp;
                // update the new list
                newList = newList.next;
                // advance to the next node in the list
                list2 = list2.next;
            }
        }
        // in a case that one of the lists are not empty, assign the next element as the rest of the list
        if (list1 == null) {
            newList.next = list2;
        } else {
            newList.next = list1;
        }
        return newHead;
    }
    public static void main(String[] args) {
        ListNode l1_node1 = new ListNode(1);
        ListNode list1 = l1_node1;
        l1_node1.next = new ListNode(2);
        l1_node1 = l1_node1.next;
        l1_node.next = 
    }
}