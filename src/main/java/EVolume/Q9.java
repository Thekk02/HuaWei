package EVolume;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author kk
 * @description 单向链表中间节点
 * @date 2024-12-5 14:55:31
 */
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] head = sc.nextLine().split(" ");
        String headAdd = head[0];
        int num = Integer.parseInt(head[1]);

        HashMap<String,String[]> nodeMap = new HashMap<>();
        for(int i = 0;i < num;i++){
            String[] data = sc.nextLine().split(" ");
            String add = data[0];
            String val = data[1];
            String next = data[2];
            nodeMap.put(add,new String[]{val,next});
        }
        String slow = headAdd;
        String fast = headAdd;
        while(fast != null && nodeMap.containsKey(fast)){
            fast = nodeMap.get(fast)[1];
            if(!nodeMap.containsKey(fast)){
                break;
            }
            fast = nodeMap.get(fast)[1];
            slow = nodeMap.get(slow)[1];
        }
        System.out.println(nodeMap.get(slow)[0]);
    }
}
