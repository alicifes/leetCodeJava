package middle.code_445;

/**
 * @Author:chenyuxiang
 * @Date:2024/3/7
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description: 给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 */

public class Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode res = new Solution().addTwoNumbers(l1, l2);
        System.out.println(res);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        ListNode p = l1, q = l2, curr = dummy;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            carry += x + y;
            curr.next = new ListNode(carry % 10);
            curr = curr.next;
            carry /= 10;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return reverseList(dummy.next);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = reverseList(head.next);
        //反转当前的
        head.next.next = head;
        head.next = null;
        return pre;
    }
}
