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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        ListNode current1 = l1;
        ListNode current2 = l2;
        while(current1!=null || current2!=null || carry!=0){
            int a;
            int b;
            int sum;
            if(current1==null){
                a=0;
            } else {
                a = current1.val;
            }

            if(current2==null){
                b=0;
            } else {
                b = current2.val;
            }
            sum = a + b + carry;
            if(sum>=10){
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }

            dummy.next = new ListNode(sum);
            dummy = dummy.next;
            if(current1!=null) {current1 = current1.next;}
            if(current2!=null) {current2 = current2.next;}
        }

        return head.next;
    }
}
