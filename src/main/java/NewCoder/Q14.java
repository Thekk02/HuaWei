package NewCoder;

import DataStructures.ListNode;

/**
 * @author kk
 * @description 链表的奇偶重排
 * @date 2024-12-12 09:35:50
 */
public class Q14 {
    public ListNode oddEvenList (ListNode head) {
        if(head == null){
            return null;
        }
        ListNode even = head.next;
        ListNode odd = head;
        ListNode evenhead = even;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        return head;
    }
}
