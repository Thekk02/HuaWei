package CVolume;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author kk
 * @description 悄悄话
 * @date 2024-12-28 14:41:44
 */
public class Q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] times = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ans = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(0);
        while(!queue.isEmpty()){
            int fa = queue.removeFirst();

            int ch1 = 2 * fa + 1;
            int ch2 = 2 * fa + 2;

            boolean ch1_exist = ch1 < times.length && times[ch1] != -1;

            boolean ch2_exist = ch1 < times.length && times[ch2] != -1;

            if(ch1_exist){
                times[ch1] += times[fa];
                queue.addLast(ch1);
            }
            if(ch2_exist){
                times[ch2] += times[fa];
                queue.addLast(ch2);
            }
            if(!ch1_exist && !ch2_exist){
                ans = Math.max(ans,times[fa]);
            }
        }
        System.out.println(ans);
    }
}
