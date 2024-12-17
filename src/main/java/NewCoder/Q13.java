package NewCoder;

import DataStructures.ListNode;

import java.util.ArrayList;

/**
 * @author kk
 * @description 判断一个链表是否为回文结构
 * @date 2024-12-12 09:25:46
 */
public class Q13 {
    public boolean isPail (ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(0,head.val);
            head = head.next;
        }
        int l = 0,r = list.size() - 1;
        while(l <= r){

            int num1 = list.get(l);
            int num2 = list.get(r);
            if(num1 != num2){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

