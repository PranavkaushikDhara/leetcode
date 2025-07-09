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
        if(head == null || head.next ==null){
            return null;
        }
        ListNode fast = head, slow = null,prev = null;
        int counter = 0;
        while(fast.next!=null){
            counter++;
            if(counter == n){
                prev = slow;
                slow = head;
            }
            if(slow!=null){
                prev = slow;
                slow = slow.next;
            }
            fast = fast.next;
        }
        if(slow!=null && prev!=null){
            prev.next = slow.next;
        }
        if(slow == null){
            return head.next;
        }
        if(prev==null){
            head.next = null;
        }
        return head; 
    }
}