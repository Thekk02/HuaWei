package NewCoder;

import DataStructures.ListNode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author kk
 * @description 单链表的排序
 * @date 2024-12-12 09:20:23
 */
public class Q12 {
    public ListNode sortInList (ListNode head) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        ListNode nhead = new ListNode(-1);
        ListNode dummy = nhead;
        for(Integer num : list){
            ListNode node = new ListNode(num);
            nhead.next = node;
            nhead = nhead.next;
        }
        return dummy.next;
    }
}
