/**
 * @Author:chenyuxiang
 * @Date:2024/3/28
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description:
 */
package easy.code_203;
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1,head);
        ListNode cur = dummy;
        while (cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {


    }
}
