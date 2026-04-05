/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==1 && head.next == null){
            head = null;
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        int count = 0;
        while(current!=null){
            if(count == n){
                if(count == 0){
                    ListNode next = current.next;
                    current.next = null;
                    return next;
                } else if(current.next==null){
                    prev = null;
                    return head;
                } else {
                    ListNode next = current.next;
                    prev.next = next;
                    current = next;
                    return head;
                }
            }
           prev = current;
           current = current.next;
           count++;
        }
        return head;
    }
}
