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
    public ListNode middleNode(ListNode head) {
        int len=listLength(head);
        int m=len/2;
        
        ListNode temp=head;
        int count=0;
        while(count<m){
            count++;
            temp=temp.next;
        }
        return temp;
        
    }
    public int listLength(ListNode head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
            return len;
    }

}