package easy.code_141;
/**
 * @Author:chenyuxiang
 * @Date:2024/3/8
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description:给你一个链表的头节点 head ，判断链表中是否有环。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，
 * 评测系统内部使用整数 pos 来表示链表尾
 * 连接到链表中的位置（索引从 0 开始）。注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。
 * 如果链表中存在环 ，则返回 true 。 否则，返回 false 。
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        boolean res = new Solution().hasCycle(head);
        System.out.println(res);
    }

    public boolean hasCycle(ListNode head) {
//        if(head ==null || head.next == null){
//            return false;
//        }
//        ListNode slow = head;
//        int count = 0;
//        while (slow != null) {
//            slow = slow.next;
//            count++;
//            if (count > 10000) {
//                return true;
//            }
//        }
//        return false;
        //快慢指针的效率更高
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }
}

