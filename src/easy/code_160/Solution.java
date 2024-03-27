package easy.code_160;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLen = 0;
        int bLen = 0;
        ListNode dummy1 = headA;
        ListNode dummy2 = headB;
        while (dummy1 != null) {
            dummy1 = dummy1.next;
            aLen++;
        }
        while (dummy2 != null) {
            dummy2 = dummy2.next;
            bLen++;
        }
        int diff = Math.abs(aLen - bLen);
        while (diff > 0) {
            if (aLen < bLen) {
                headB = headB.next;
            } else {
                headA = headA.next;
            }
            diff--;
        }
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
