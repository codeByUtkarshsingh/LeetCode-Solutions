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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail=head;
        int l=1;
        if(head == null || head.next == null || k==0){
            return head;
        }
        while(tail.next != null){
            l++;
            tail = tail.next;
        }
        k=k%l;
        for(int i=0;i<k;i++){
            ListNode curr=head;
            while(curr.next!=tail){
                curr=curr.next;
            }
            tail.next=head;
            curr.next= null;
            head=tail;
            tail=curr;
        }
        return head;

    }
}