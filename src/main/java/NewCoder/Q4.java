package NewCoder;

import DataStructures.ListNode;

/**
 * @author kk
 * @description 合并两个有序链表
 * @date 2024-12-12 08:19:55
 */
public class Q4 {
    public ListNode Merge (ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null){
            return pHead1 == null ? pHead2 : pHead1;
        }
        if(pHead1.val < pHead2.val){
            pHead1.next = Merge(pHead1.next,pHead2);
            return Merge(pHead1.next,pHead2);
        }else{
            pHead2.next = Merge(pHead1,pHead2.next);
            return pHead2;
        }
    }

}
