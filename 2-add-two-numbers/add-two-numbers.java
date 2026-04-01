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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum =new ListNode(0);
        ListNode temp=sum;
        int c=0;
        while(l1!=null || l2!=null || c!=0){
            int v1=(l1!=null)?l1.val:0;
            int v2=(l2!=null)?l2.val:0;
            int s=v1+v2+c;
            c=s/10;
            temp.next=new ListNode(s%10);
            temp=temp.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return sum.next;
    }
}