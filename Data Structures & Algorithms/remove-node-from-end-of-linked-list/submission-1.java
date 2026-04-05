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
        ListNode current = head;
        int length = 0;
        while(current!=null){
            length++;
            current = current.next;
        }
        int m = length-n;
        current = head;
        ListNode prev = null;
        int count = 0;
        while(current!=null){
            if(count == m){
                if(count == 0){
                    ListNode next = current.next;
                    current.next = null;
                    return next;
                } else if(count<length){
                    ListNode next = current.next;
                    prev.next = next;
                    current = next;
                    return head;
                } else if(count == length){
                    prev.next = null;
                    return head;
                }
            }
            count++;
            prev = current;
            current = current.next;
        }

        return head;        
    }
}
