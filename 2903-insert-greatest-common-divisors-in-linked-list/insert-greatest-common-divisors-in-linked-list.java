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
    public int GCD(int a,int b){
        int q = a/b;
        int r = a%b;
        while(r != 0){
            a = b;
            b = r;
            q = a/b;
            r = a%b;
        }
        return b;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) return head;
        ListNode temp = head;
        int gcd = 0;
        while(temp.next != null){
            int a = temp.val;
            int b = temp.next.val;
            if(a > b) gcd = GCD(a,b);
            else gcd = GCD(b,a);
            ListNode g = new ListNode(gcd);
            g.next = temp.next;
            temp.next = g;
            temp = temp.next.next;
        }
        return head;
    }
}