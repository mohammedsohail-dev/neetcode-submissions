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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }

        ListNode first = lists[0];
        for(int i=1;i<lists.length;i++){
            first = add_two(first,lists[i]);
        }
        return first;
    }

    ListNode add_two(ListNode head1,ListNode head2){
        ListNode current1 = head1;
        ListNode current2 = head2;

        ListNode ans = new ListNode();
        ListNode head = ans;
        while(current1!=null && current2!=null){
            if(current1.val<=current2.val){
                ans.next = current1;
                current1 = current1.next;
            } else {
                ans.next = current2;
                current2 = current2.next;
            }
            ans = ans.next;
        }
        if(current1==null){
            ans.next = current2;
        }else {
            ans.next = current1;
        }

        return head.next;    
    }
}
