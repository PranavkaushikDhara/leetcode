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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }

        ListNode first = head, second = head.next;
        ListNode prev = head;

        while(first!=null && second!= null){
            prev = first;
            first.next = second.next;
            second.next = first;
            first = first.next;
            prev.next = first;
            if(first == null){
                break;
            }
            else{
                second = first.next;
            }
        }

        return head.next;

    }
}