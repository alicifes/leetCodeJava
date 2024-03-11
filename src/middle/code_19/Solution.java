package middle.code_19;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> currentNode = new ArrayList<>();
        while (head != null) {
            currentNode.add(head);
            head = head.next;
        }
        int size = currentNode.size();
        if(size == 1) {
            return null;
        }
        if(size == n) {
            return currentNode.get(1);
        }
        if(n == 1) {
            currentNode.get(size - 2).next = null;
            return currentNode.get(0);
        }
        currentNode.get(size - n - 1).next = currentNode.get(size - n + 1);
        return currentNode.get(0);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode listNode = solution.removeNthFromEnd(head, 2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
