package easy.code_206;
/**
 * @Author:chenyuxiang
 * @Date:2024/3/6
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description:
 */
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
import easy.code_206.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = new ListNode();
        while (head.next != null){
            if(cur.next == null){
                cur.next = new ListNode();
            } else {
                cur.next = head;
                head.val = cur.next.val;
            }
        }
        return cur.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode rev = new Solution().reverseList(head);
        System.out.println(rev);
    }
}
