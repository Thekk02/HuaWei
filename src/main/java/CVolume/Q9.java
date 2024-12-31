package CVolume;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @author kk
 * @description 报数游戏
 * @date 2024-12-28 10:51:22
 */
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if(m <= 1 || m >= 100){
            System.out.println("ERROR!");
            return;
        }
        CycleLinkedList list = new CycleLinkedList();
        for(int i = 1;i <= 100;i++){
            list.append(i);
        }
        int idx = 1;
        Node cur = list.head;
        while(list.size >= m){
            if(idx == m){
                idx = 1;
                cur = list.remove(cur);
            }else{
                idx++;
                cur = cur.next;
            }
        }
        System.out.println(list.toString());
    }
    static class Node{
        int val;
        Node prev;
        Node next;
        public Node(int val,Node prev,Node next){
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    static class CycleLinkedList{
        Node head;
        Node tail;
        int size = 0;
        public void append(int val){
            Node node = new Node(val,null,null);
            if(this.size > 0){
                this.tail.next = node;
                node.prev = this.tail;
                this.tail = node;
            }else{
                this.head = node;
                this.tail = node;
            }
            this.head.prev = node;
            this.tail.next = this.head;
            this.size++;
        }
        public Node remove(Node cur){
            Node pre = cur.prev;
            Node nxt = cur.next;
            pre.next = nxt;
            nxt.prev = pre;

            cur.next = cur.prev = null;
            if(this.tail == cur){
                this.tail = pre;
            }if(this.head == cur){
                this.head = nxt;
            }
            this.size--;
            return nxt;
        }
        @Override
        public String toString(){
            StringJoiner sj = new StringJoiner(",");
            Node cur = this.head;
            for(int i = 0;i < size;i++){
                sj.add(cur.val + "");
                cur = cur.next;
            }
            return sj.toString();
        }
    }
}
