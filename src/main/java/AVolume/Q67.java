package AVolume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 查找充电设备组合
 * @date 2024-12-28 13:54:59
 */
public class Q67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int p_max = sc.nextInt();
//        System.out.println(helper());
    }


    public static int helper(int n,int[] p,int p_max){
        int[][] dp = new int[n + 1][ p_max + 1];
        for(int i = 0;i <= n;i++){

        }
        return 0;
    }
}
