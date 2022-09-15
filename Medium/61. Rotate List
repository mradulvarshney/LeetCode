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
class Solution 
{
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head==null)
            return head;
        int size=0;
        ListNode tail = head;
        while(tail!=null)
        {
            tail=tail.next;
            size++;
        }
        k = k % size;
       
        ListNode node = head;
        ListNode n = null;
        while(head.next != null && k!=0)
        {
            if(head.next.next == null)
            {
                n = head;
                head = head.next;
            }
            if(head.next == null)
            {
                head.next = node;
                n.next = null;
                node = head;
                k--;
            }
            else
            {
                head = head.next;
            }
        }
        
        return node;
    }
}
