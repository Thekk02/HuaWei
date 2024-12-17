package NewCoder;

import DataStructures.ListNode;

import java.util.HashSet;

/**
 * @author kk
 * @description 删除有序链表中重复的元素
 * @date 2024-12-12 09:42:47
 */
public class Q15 {
    public ListNode deleteDuplicates (ListNode head) {
        if(head == null){
            return null;
        }
        ListNode cur = head;
        while(cur != null && cur.next != null){
            if(cur.next.val == cur.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }

}
