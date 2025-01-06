package DVolume;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 贪吃的猴子
 * @date 2025-1-6 15:37:36
 */
public class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] bnanas = new int[len];
        for(int i = 0;i < len;i++){
            bnanas[i] = sc.nextInt();
        }
        int sumB = Arrays.stream(bnanas).sum();
        int n = sc.nextInt();
        if(n >= len){
            System.out.println(sumB);
        }else{
            int window_len = len - n;
            int sum = 0;
            for(int i = 0;i  < window_len;i++){
                sum += bnanas[i];
            }
            int min =sum;
            for(int i = window_len;i < len;i++){
                sum -= bnanas[i - window_len];
                sum += bnanas[i];

                min = Math.min(min,sum);
            }
            System.out.println(sumB - min);
        }
    }
}
