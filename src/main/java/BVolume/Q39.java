package BVolume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 篮球比赛
 * @date 2025-1-1 12:05:41
 */
public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [] times = new int[n];
        for(int i =0;i < n;i++){
            times[i] = sc.nextInt();
        }
        Arrays.sort(times);
        int[] mArr = new int[m];
        for(int i = 0;i < n;i++){
            mArr[i % m] += times[i];
        }
        System.out.println(Arrays.stream(mArr).max().orElse(0));
    }
}
