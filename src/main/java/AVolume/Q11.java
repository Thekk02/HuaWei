package AVolume;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author kk
 * @description 单向链表中间节点
 * @date 2024-12-20 14:36:09
 */
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String head = sc.next();
        int num = sc.nextInt();
        HashMap<String,String[]> nodes = new HashMap<>();
        for(int i = 0;i < num;i++){
            String addr = sc.next();
            String val = sc.next();
            String nextAddr = sc.next();
            nodes.put(addr,new String[]{val,nextAddr});
        }
        System.out.println(helper(head,nodes));
    }
    public static String helper(String head,HashMap<String,String[]> nodes){

        ArrayList<String> link = new ArrayList<>();
        String[] node = nodes.get(head);
        while(node != null){
            String val = node[0];
            String next = node[1];
            link.add(val);
            node = nodes.get(next);
        }
        int len = link.size();
        int mid = len /2;
        return link.get(mid);
    }
}
