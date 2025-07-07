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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        ListNode head, curr1, curr2;

        if (list1.val <= list2.val) {
            head  = list1;
            curr1 = list1.next;
            curr2 = list2;
        } else {
            head  = list2;
            curr1 = list1;
            curr2 = list2.next;
        }
        ListNode end = head;                  
        while(curr1 != null && curr2 != null){
            if(curr1.val < curr2.val){
                end.next = curr1;
                curr1 = curr1.next;
            }
            else{
                end.next = curr2;
                curr2 = curr2.next;
            }
            end = end.next;
        }

        end.next = (curr1 != null) ? curr1 : curr2;
        return head;

    }
}