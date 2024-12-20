package AVolume;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author kk
 * @description 插队
 * @date 2024-12-5 10:04:42
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[][] arr = new String[num][];
        for(int i = 0;i < num;i++){
            arr[i] = sc.nextLine().split(" ");
        }
        getResult(num,arr);
    }
    public static void getResult(int n,String[][] arr){
        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a,b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        for(int i = 0;i < n;i++){
            String[] temp = arr[i];
            switch (temp[0]){
                case "a":
                    int num = Integer.parseInt(temp[1]);
                    int x = Integer.parseInt(temp[2]);
                    pq.offer(new int[]{x,i,num});
                    break;
                case  "p":
                    int[] poll = pq.poll();
                    if(poll != null){
                        System.out.println(poll[2]);
                    }else{
                        System.out.println("");
                    }
            }
        }
    }
}
