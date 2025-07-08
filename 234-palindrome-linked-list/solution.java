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
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow= slow.next;
            fast = fast.next.next;
        }
        ListNode first = head, second = reverse(slow);
        while(first!=null && second!=null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head, prev=null, next = curr.next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}