// code start

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
        int size=0,mid=0;
        ListNode prev= head;
        ListNode curr= head.next;
        if(head==null || head.next==null)
        {
            return head;
        }
        while(curr!=null)
        {
            curr=curr.next;
            size++;
        }
        size++;
        if(size%2==1)
        {
            curr=head;
            mid=size/2+1;
            for(int i=0;i<mid-1;i++)
            {
                curr=curr.next;
            }
        }
        else
        {
            curr=head;
            mid=size/2;
            for(int i=0;i<mid;i++)
            {
                curr=curr.next;
            }
        }
        return curr;
    }
}

// code end

