package easy.code_206;
/**
 * @Author:chenyuxiang
 * @Date:2024/3/6
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description:
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = reverseList(head.next);
        //反转当前的
        head.next.next = head;
        head.next = null;
        return pre;
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
