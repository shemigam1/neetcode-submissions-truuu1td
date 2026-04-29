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
    public void reorderList(ListNode head) {
        ListNode tail = head;
        ListNode mid = head;
        ListNode curr = head;

        while (tail.next != null && tail.next.next != null){
            mid = mid.next;
            tail = tail.next.next;
        }
        tail = mid.next;
        mid.next = null;

        ListNode hydra = reverse(tail);
        while (hydra != null){
            ListNode next = curr.next;
            curr.next = hydra;
            curr = next;
            next = hydra.next;
            hydra.next = curr;
            hydra = next;
        }
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while (head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
