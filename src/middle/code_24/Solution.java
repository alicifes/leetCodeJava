package middle.code_24;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode cur = head;
        //只是交换两个节点的值
        while (cur != null && cur.next != null) {
            int temp = cur.val;
            cur.val = cur.next.val;
            cur.next.val = temp;
            cur = cur.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode listNode = solution.swapPairs(head);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
