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
        
        // case of two empty list
        if (list1==null && list2==null){
            return list1;
        }
        
        //set a dummy node which next node is the answer
        ListNode dummy = new ListNode (0);
        ListNode list3 = dummy;
        
        //while current nodes at list1 and list 2 are both non-empty, 
        //compare their values and add the smaller node to list3.
        //Then move a node down the list processed.
        while (list1 != null && list2 != null){
            if (list1.val<=list2.val){
                dummy.next = new ListNode (list1.val);
                dummy = dummy.next;
                list1 = list1.next;
            } else {
                dummy.next = new ListNode (list2.val);
                dummy = dummy.next;
                list2 = list2.next;             
            }
        }
        
        //while list1 / list2 are still non-empty, add the remaining node to list3
        while (list1 != null){
            dummy.next = new ListNode (list1.val);
            dummy = dummy.next;
            list1 = list1.next;
        }
        
        while (list2 != null){
            dummy.next = new ListNode (list2.val);
            dummy = dummy.next;
            list2 = list2.next;
        }        
        return list3.next;
    }
}
