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
        
        // array for storing the linked list and counter on the length
        int[] arr= new int[100000];
        int count=0;
        
        // storing values in linked list to array
        while (head!=null){
            arr[count]=head.val;
            count++;
            head = head.next;
        }
        
        // checked the items in array one by one, from front and end to check
        // if they are equal
        for (int i=0; i<count/2 ; i++){
            if (arr[i]!=arr[count-i-1]){
                return false;
            }
        }        
        
        return true;
    }
}
