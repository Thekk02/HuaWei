package NewCoder;

import DataStructures.ListNode;
import netscape.security.UserTarget;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author kk
 * @description 反转链表
 * @date 2024-12-12 08:02:30
 */
public class Q1 {
    public ListNode ReverseList (ListNode head) {
        LinkedList<ListNode> list = new LinkedList<>();
        if(head == null){
            return null;
        }
        while(head != null){
            list.push(head);
            head = head.next;
        }
        if(list.isEmpty())

        {
            return null;
        }
        ListNode node = list.pop();
        ListNode dummy = node;
        while(!list.isEmpty()){
            ListNode temp = list.pop();
            node.next = temp;
            node = node.next;
        }
        node.next = null;
        return dummy;
    }
}
