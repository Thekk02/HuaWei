package DVolume;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author kk
 * @description 剩余银饰的重量
 * @date 2024-12-20 15:04:30
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> weights = new LinkedList<>();
        for(int i = 0;i < n;i++){
            weights.add(sc.nextInt());
        }
        weights.sort((a,b) -> a- b);
        while(weights.size() >= 3){
            int z = weights.removeLast();;
            int y = weights.removeLast();
            int x = weights.removeLast();

            int remain = Math.abs((z - y) - (y - x));
            if(remain != 0){
                int idx = Collections.binarySearch(weights,remain);
                if(idx < 0){
                    idx = -idx - 1;
                }
                weights.add(idx,remain);
            }
        }
        if(weights.size() == 2){
            System.out.println(Math.max(weights.get(0),weights.get(1)));
        }else if(weights.size() == 1){
            System.out.println(weights.get(0));
        }else{
            System.out.println(0);
        }

    }
}
