package NewCoder;

import DataStructures.ListNode;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * @author kk
 * @description 链表相加2
 * @date 2024-12-12 08:56:20
 */
public class Q11 {
    public ListNode addInList (ListNode head1, ListNode head2) {
       if(head1 == null){
           return head2;
       }
       if(head2 == null){
           return head1;
       }
       LinkedList<Integer> stack1 = new LinkedList<>();
       LinkedList<Integer> stack2 = new LinkedList<>();
       while(head1 != null){
           stack1.push(head1.val);
           head1 = head1.next;
       }
       while(head2 != null){
           stack2.push(head2.val);
           head2 = head2.next;
       }
       int temp = 0;
       ListNode head = new ListNode(-1);
       ListNode nHead =  head.next;
       while(!stack1.isEmpty() || !stack2.isEmpty()){
           int val = temp;
           if(!stack1.isEmpty()){
               val += stack1.pop();
           }
           if(!stack2.isEmpty()){
               val += stack2.pop();
           }
           temp = val /10;
           ListNode node = new ListNode(val % 10);
           node.next = nHead;
           nHead = node;
       }
       if(temp > 0){
           ListNode node = new ListNode(temp);
           node.next = nHead;
           nHead = node;
       }
       return nHead;

    }
}
