package middle.code_148;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chenyuxiang
 * @Date 2024/4/16
 * @Description
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        List list = new ArrayList();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        list.sort((o1, o2) -> (int) o1 - (int) o2);
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (Object o : list) {
            cur.next = new ListNode((int) o);
            cur = cur.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(4);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        solution.sortList(head);
    }
}
