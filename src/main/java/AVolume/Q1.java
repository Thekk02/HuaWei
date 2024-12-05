package AVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description linux发行版的数量
 * @date 2024-12-5 09:57:26
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                nums[i][j] = sc.nextInt();
            }
        }
    }

}
