package AVolume;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author kk
 * @description 打印机队列
 * @date 2024-12-20 14:23:43
 */
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] tasks = new String[n][];
        for(int i = 0;i < n;i++){
            String[] s = sc.nextLine().split(" ");
            tasks[i] = s;
        }
        helper(tasks);
    }
    public static void helper(String[][] tasks){
        HashMap<String, PriorityQueue<int[]>> print = new HashMap<>();
        int x = 1;
                for(int i = 0;i < tasks.length;i++){
                    String[] task = tasks[i];
                    String type = task[0];
                    String printId = task [1];
                    if("IN".equals(type)){
                        String priority = task[2];
                        int[] arr = {x,Integer.parseInt(priority),i};
                        print.putIfAbsent(
                                printId,
                                new PriorityQueue<>((a,b) -> a[1] != b[1] ? b[1] - a[1] : a[2] - b[2]));
                        print.get(printId).offer(arr);
                        x++;
                    }else{
                        if(!print.containsKey(printId) || print.get(printId).isEmpty()){
                            System.out.println("NULL");
                        }else{
                            int[] arr = print.get(printId).poll();
                            if(arr != null){
                                System.out.println(arr[0]);
                            }else{
                                System.out.println("NULL");
                            }
                        }
                    }


                }
    }

}
