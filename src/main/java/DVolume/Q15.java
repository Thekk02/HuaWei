package DVolume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kk
 * @description 最大矩阵和
 * @date 2025-1-6 10:22:47
 */
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //System.out.println(helper(n,m,matrix));
    }


}
