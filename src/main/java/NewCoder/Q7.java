package NewCoder;

import DataStructures.ListNode;

import java.util.HashSet;

/**
 * @author kk
 * @description 链表中环的入口节点
 * @date 2024-12-12 08:44:07
 */
public class Q7 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null){
            return null;
        }
        HashSet<ListNode> set = new HashSet<>();
        while(pHead != null){
            if(set.contains(pHead)){
                return pHead;
            }else{
                set.add(pHead);
                pHead = pHead.next;
            }

        }
        return null;
    }
}
