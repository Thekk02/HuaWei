package DVolume;

import java.util.Scanner;

/**
 * @author kk
 * @description 最小矩阵宽度
 * @date 2025-1-6 17:02:56
 */
public class Q81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        int[] nums = new int[k];
        for(int i = 0;i < k;i++){
            nums[i] = sc.nextInt();
        }
    }
}
