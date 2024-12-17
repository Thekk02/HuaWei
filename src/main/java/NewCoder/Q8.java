package NewCoder;

import DataStructures.ListNode;

import java.util.LinkedList;

/**
 * @author kk
 * @description 链表中倒数最后k个节点
 * @date 2024-12-12 08:49:19
 */
public class Q8 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        LinkedList<ListNode> stack = new LinkedList<>();
        while(pHead != null){
            stack.push(pHead);
            pHead = pHead.next;
        }
        if(stack.size() < k){
            return null;
        }else{
            ListNode ans = null;
            for(int i = 0;i < k;i++){
                ans = stack.pop();
            }
            return ans;
        }
    }
}
