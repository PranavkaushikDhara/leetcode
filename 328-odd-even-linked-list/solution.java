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
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd=head, even=head.next, second = head.next,prev=null;
        
        while(odd!=null && even!=null){
                odd.next = even.next;
                prev=odd;
                odd = odd.next;
                
                if(odd!=null)
                even.next = odd.next;
                else
                even.next = odd;
                even = even.next;
        }
        if(odd!=null)
        odd.next = second;
        else
        prev.next = second;
        return head;
    }
}