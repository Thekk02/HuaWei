package NewCoder;

import DataStructures.ListNode;

/**
 * @author kk
 * @description 删除有序链表中重复的元素2
 * @date 2024-12-12 09:52:04
 */
public class Q16 {
    public ListNode deleteDuplicates (ListNode head) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode next;
        ListNode cur = head;
        ListNode pre = node;
        while(cur != null){
            next = cur.next;
            boolean temp = false;
            while(next != null && cur.val == next.val){
                next = next.next;
                pre.next = next;
                temp = true;
            }
            if(!temp){
                pre = cur;
            }
            cur = next;
        }
        return node.next;
    }
}
