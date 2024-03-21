package easy.code_83;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        List<Integer> hash = new ArrayList<>();
        ListNode pre = dummy;
        ListNode cur = dummy.next;
        while (cur != null) {
            if(!hash.contains(cur.val)){
                hash.add(cur.val);
                pre = pre.next;
            } else {
                pre.next = cur.next;
                cur = pre;
            }
            cur = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        ListNode result = solution.deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
