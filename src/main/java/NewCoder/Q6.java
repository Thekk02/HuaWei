package NewCoder;

import DataStructures.ListNode;

/**
 * @author kk
 * @description 判断链表中是否有环
 * @date 2024-12-12 08:35:18
 */
public class Q6 {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode s = head;
        ListNode f = head;
        while(f.next != null & f.next.next != null){
            f = f.next.next;
            s = s.next;
            if(f == s){
                return true;
            }
        }
        return false;
    }
}
