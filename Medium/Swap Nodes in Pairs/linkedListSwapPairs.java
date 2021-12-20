/**
 * Solution to problem 24. Swap Nodes in Pairs
 * @link: https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class linkedListSwapPairs {
    public ListNode swapPairs(ListNode head) {
        //let's work with values
        ListNode current = head;
        int valueHolder;
        // this way we make sure we work with couples, and on odd length list
        // the last node won't have a pair
        while (current != null && current.next != null) {
            //save the current node value
            valueHolder = current.val;
            // change the current value with its couple's value
            current.val = current.next.val;
            current.next.val = valueHolder;
            //move on to the next pair
            current = current.next.next;
        }
        return head;
    }
}
