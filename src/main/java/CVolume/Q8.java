package CVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 报数问题(约瑟夫桓问题)
 * @date 2024-12-28 10:50:42
 */
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(helper(sc.nextInt()));
    }
    public static int helper(int n){
        CycleLinkedList list = new CycleLinkedList();
        for(int i = 1;i <= n;i++){
            list.append(i);
        }
        int num = 1;
        Node cur = list.head;
        while(list.size > 1){
            if(num == 3){
                num = 1;
                cur = list.remove(cur);
            }else{
                num++;
                cur = cur.next;
            }
        }
        return cur.val;
    }
    static class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val){
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }
    static class CycleLinkedList{
        Node head;
        Node tail;
        int size;

        public CycleLinkedList(){
            this.head = null;
            this.tail = null;
            this.size = 0;
        }
        public void append(int val){
            Node node = new Node(val);
            if(this.size > 0){
                this.tail.next = node;
                node.prev = tail;
                this.tail = node;
            }else{
                this.head = node;
            }
            this.tail = node;
            this.head.prev = this.tail;
            this.tail.next = this.head;
            this.size++;
        }
        public Node remove(Node cur){
            Node pre = cur.prev;
            Node nxt = cur.next;
            pre.next = nxt;
            nxt.prev = pre;
            cur.next = cur.prev = null;
            if(this.head == cur){
                this.head = nxt;
            }
            if(this.tail == cur){
                this.tail = pre;
            }
            this.size--;
            return nxt;
        }
    }


}
