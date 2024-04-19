package middle.code_237;

/**
 * @Author chenyuxiang
 * @Date 2024/4/16
 * @Description
 */
public class Solution {
    ListNode head = new ListNode(4);

    public void deleteNode(ListNode node) {
        ListNode dummy = head;
        while (dummy.next != null) {
            if (dummy.next.val == node.val) {
                dummy.next = dummy.next.next;
                break;
            }
            dummy = dummy.next;
        }
    }
}
