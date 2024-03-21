package middle.code_92;

/**
 * @Author:chenyuxiang
 * @Date:2024/3/20
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description: 给你单链表的头指针 head 和两个整数 left 和 right ，
 * 其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 */

//头插法
public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
       ListNode dummy = new ListNode(-1);
       dummy.next = head;
       ListNode pre = dummy;
       for (int i = 0; i < left - 1; i++) {
           pre = pre.next;
       }
       ListNode cur = pre.next;
       ListNode next;
       for (int i = 0; i < right - left + 1; i++) {
           next = cur.next;
           cur.next = next.next;
           next.next = pre.next;
           pre.next = next;
       }
       return dummy.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        ListNode result = solution.reverseBetween(head, 2, 4);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
