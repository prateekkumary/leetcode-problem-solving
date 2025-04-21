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
         if(list1==null && list2==null)
        {
            return list1;
        }
        ListNode temp=new ListNode(0);//0->1->1->2->3->4->4
        ListNode curr=temp;//4
        ListNode c1=list1;//1->2->4->null
        ListNode c2=list2;//1->3->4->null

        while(c1!=null && c2!=null)//c1=1 && c2=1, c1=2 && c2=1,c1=2 && c2=3,c1=4 && c2=3,c1=4 && c2=4,c1=null && c2=4(false)
        {
            if(c1.val<=c2.val)//1<=1(true),2<=1(false),2<=3(true),4<=3(false),4<=4(true)
            {
                curr.next=c1;
                c1=c1.next;
            }
            else//2>=1(true),4>=3(true)
            {
                curr.next=c2;
                c2=c2.next;
            }
            curr=curr.next;
        }
        if(c1!=null)//(false)
        {
            curr.next=c1;
        }
        if(c2!=null)//4
        {
            curr.next=c2;
        }
        return temp.next;
    }
}